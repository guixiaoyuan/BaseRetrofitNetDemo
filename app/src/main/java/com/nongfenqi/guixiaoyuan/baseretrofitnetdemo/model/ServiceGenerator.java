package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.functions.Func1;

/**
 * 将client接口转化为具体的Url
 *
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
 */
public class ServiceGenerator {
    private static final String TAG = ServiceGenerator.class.getSimpleName();

    private static OkHttpClient.Builder sBuilder = new OkHttpClient.Builder();

    private static OkHttpClient sClient;

    public static <S> S createService(Class<S> serviceClass) {
        return createService(serviceClass, UrlConstant.SERVER_API_BASE_URL);
    }

    public static <S> S createService(Class<S> serviceClass, String baseUrl) {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create());

        sBuilder.connectTimeout(24, TimeUnit.SECONDS);
        sClient = sBuilder.build();

        sClient.dispatcher().setMaxRequestsPerHost(20);
        Retrofit retrofit = builder.client(sClient).build();
        return retrofit.create(serviceClass);
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
                checkRetCode(baseResponse.getRetCode());
                throw new RuntimeException(baseResponse.getRetMsg());
            }
        }
    }

    /**
     * 检查服务器返回的状态码，如果异常，则统一处理
     *
     * @param response
     * @throws Exception
     */
    public static void checkRetCode(int response) {
        //todo 定制处理
    }
}
