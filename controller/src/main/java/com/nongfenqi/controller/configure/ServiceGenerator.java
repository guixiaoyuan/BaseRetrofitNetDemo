package com.nongfenqi.controller.configure;

import android.content.Context;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.RetCodeUtil;
import com.nongfenqi.controller.exception.ApiException;
import com.nongfenqi.library.LibraryEnvironment;
import com.nongfenqi.library.tools.FileUtil;
import com.nongfenqi.library.tools.SPUtil;
import com.nongfenqi.library.tools.StringUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.functions.Func1;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 18/10/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public class ServiceGenerator {
    private static final String TAG = ServiceGenerator.class.getSimpleName();
    private static Context context;

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static OkHttpClient client;

    private static boolean init = false;


    public static void setContext(Context context) {
        ServiceGenerator.context = context;
    }

    public static <S> S createService(Class<S> serviceClass) {
        return createService(serviceClass, UrlConstant.SERVER_API_BASE_URL, true);
    }

    public static <S> S createService(Class<S> serviceClass, boolean isNeedToken) {
        return createService(serviceClass, UrlConstant.SERVER_API_BASE_URL, isNeedToken);
    }

    public static <S> S createService(Class<S> serviceClass, String baseUrl) {
        return createService(serviceClass, baseUrl, true);
    }

    public static <S> S createService(Class<S> serviceClass, String baseUrl, boolean needToken) {
        return createService(serviceClass, baseUrl, needToken, null);
    }

    public static <S> S createService(Class<S> serviceClass, String baseUrl, boolean needToken, final String token) {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create());
        if (needToken) {
            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();
                    if (!StringUtil.isEmpty(LibraryEnvironment.getToken()) && context != null) {
                        LibraryEnvironment.setToken(SPUtil.get(context, "token", ""));
                    }

                    String mToken;
                    if (StringUtil.isEmpty(token)) {
                        mToken = LibraryEnvironment.getToken();
                    } else {
                        mToken = token;
                    }

                    // Request customization: add request headers
                    Request.Builder requestBuilder = original.newBuilder()
                            .header("x-auth-token", mToken)
                            .method(original.method(), original.body());

                    Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });
        }
        if (!init) {
            httpClient.addInterceptor(new LoggerInterceptor(LibraryEnvironment.getAppName() + "_NET"));
//            if (context != null) {
//                httpClient.addInterceptor(new ChuckInterceptor(context));
//            }
            init = true;
        }

        httpClient.connectTimeout(24, TimeUnit.SECONDS);

        client = httpClient.build();

        client.dispatcher().setMaxRequestsPerHost(20);
        Retrofit retrofit = builder.client(client).build();
        return retrofit.create(serviceClass);
    }

    /**
     * 取消所有的网络请求
     */
    public static void cancelAllRequests() {
        if (client != null) {
            client.dispatcher().cancelAll();
        }
    }

    /**
     * 统一处理服务器返回数据
     *
     * @param <T>
     */
    public static class HttpResultFunc<T> implements Func1<BaseResponse<T>, T> {

        @Override
        public T call(BaseResponse<T> baseResponse) {
            if (baseResponse.getRetCode() == UrlConstant.ERROR_NO) {
                return baseResponse.getData();
            } else {
                RetCodeUtil.checkRetCode(baseResponse.getRetCode());
                throw new ApiException(baseResponse.getRetMsg());
            }
        }
    }

    /**
     * 保存服务器文件至本地
     *
     * @param
     */
    public static class SaveFileFunc implements Func1<ResponseBody, java.lang.Boolean> {
        private String filePath;

        public SaveFileFunc(String filePath) {
            this.filePath = filePath;
        }

        @Override
        public java.lang.Boolean call(ResponseBody body) {
            return FileUtil.writeResponseBodyToDisk(body, filePath);
        }
    }

}
