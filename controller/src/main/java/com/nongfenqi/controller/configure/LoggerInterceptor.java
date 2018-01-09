package com.nongfenqi.controller.configure;

import android.text.TextUtils;

import com.nongfenqi.library.LibraryEnvironment;
import com.nongfenqi.library.tools.LogcatUtil;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/**
 * OkHttp log
 * Copied from OkHttpUtils 2.3.9
 *
 * @author jiezhi
 * @version 1.0, 13/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class LoggerInterceptor implements Interceptor {
    private String tag = LoggerInterceptor.class.getSimpleName();

    public LoggerInterceptor(String tag) {
        this.tag = tag;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        logRequest(request);

        Response response = chain.proceed(request);
        return logResponse(response);
    }

    /**
     * 打印返回
     *
     * @param response
     * @return
     */
    private Response logResponse(Response response) {
        if (response == null) {
            return null;
        }
        LogcatUtil.d(tag, "========RESPONSE'LOG=======");
        Response.Builder builder = response.newBuilder();
        Response clone = builder.build();
        LogcatUtil.d(tag, "URL:" + clone.request().url());
        LogcatUtil.d(tag, "CODE:" + clone.code());
        LogcatUtil.d(tag, "PROTOCOL:" + clone.protocol());
        if (!TextUtils.isEmpty(clone.message())) {
            LogcatUtil.d(tag, "MESSAGE:" + clone.message());
        }

        ResponseBody body = clone.body();
        if (body != null) {
            MediaType mediaType = body.contentType();
            if (mediaType != null) {
                LogcatUtil.d(tag, "ResponseBody ContentType:" + mediaType.toString());
                if (isText(mediaType)) {
                    try {
                        String responseBody = body.string();
                        LogcatUtil.d(tag, "ResponseBody Content:" + responseBody);
                        body = ResponseBody.create(mediaType, responseBody);
                        return response.newBuilder().body(body).build();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else {
                    LogcatUtil.d(tag, "ResponseBody Content: maybe too large to print:" + mediaType.subtype());
                }
            }
        }
        LogcatUtil.d(tag, "========END RESPONSE'LOG=======");
        LogcatUtil.d(tag, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        return response;
    }

    private void logRequest(Request request) {
        String url = request.url().toString();
        Headers headers = request.headers();
        LogcatUtil.d(tag, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        LogcatUtil.d(tag, "========REQUEST'LOG=======");
        LogcatUtil.d(tag, "METHOD : " + request.method());
        LogcatUtil.d(tag, "TOKEN:" + LibraryEnvironment.getToken());
        LogcatUtil.d(tag, "URL : " + url);
        if (headers != null && headers.size() > 0) {
            LogcatUtil.d(tag, "HEADERS : " + headers.toString());
        }
        RequestBody requestBody = request.body();
        if (requestBody != null) {
            MediaType mediaType = requestBody.contentType();
            if (mediaType != null) {
                LogcatUtil.d(tag, "requestBody contentType : " + mediaType.toString());
                if (isText(mediaType)) {
                    LogcatUtil.d(tag, "requestBody content : " + bodyToString(request));
                } else {
                    LogcatUtil.d(tag, "RequestBody Content: maybe too large to print:" + mediaType.subtype());
                }
            }
        }
        LogcatUtil.d(tag, "========END REQUEST'LOG=======");


    }

    /**
     * @param mediaType
     * @return
     */
    private boolean isText(MediaType mediaType) {
        if (mediaType.type() != null && "text".equals(mediaType.type())) {
            return true;
        }
        if (mediaType.subtype() != null) {
            if ("json".equals(mediaType.subtype()) ||
                    "xml".equals(mediaType.subtype()) ||
                    "html".equals(mediaType.subtype()) ||
                    "webviewhtml".equals(mediaType.subtype())
                    ) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param request
     * @return
     */
    private String bodyToString(final Request request) {
        try {
            final Request copy = request.newBuilder().build();
            final Buffer buffer = new Buffer();
            copy.body().writeTo(buffer);
            return buffer.readUtf8();
        } catch (final IOException e) {
            return "something error when show requestBody.";
        }
    }
}
