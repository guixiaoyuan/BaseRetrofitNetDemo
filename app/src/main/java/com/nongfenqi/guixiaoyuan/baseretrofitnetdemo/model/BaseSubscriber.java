package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model;

import android.content.Context;

import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.BuildConfig;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.tools.ToastUtil;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.view.LoadingDialog;

import java.io.EOFException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * Function
 *
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
 */
public abstract class BaseSubscriber<T> extends Subscriber<T> {
    private static String TAG = BaseSubscriber.class.getSimpleName();

    private Context mContext;

    private LoadingDialog mLoadingDialog;

    public BaseSubscriber(Context context) {
        this(context, TAG);
    }

    public BaseSubscriber(Context context, String tag) {
        mContext = context;
        mLoadingDialog = new LoadingDialog(mContext);
    }

    @Override
    public void onStart() {
        super.onStart();
        if (mLoadingDialog != null) {
            mLoadingDialog.show();
        }
    }

    @Override
    public void onCompleted() {
        if (mLoadingDialog != null) {
            mLoadingDialog.dismiss();
        }
    }

    @Override
    public void onError(Throwable e) {
        if (e == null || mContext == null) {
            return;
        }
        if (mLoadingDialog != null) {
            mLoadingDialog.dismiss();
        }

        if (BuildConfig.DEBUG) {
            ToastUtil.showTipsToast(mContext, e.getMessage());
        } else if (e instanceof SocketTimeoutException) {
            ToastUtil.showTipsToast(mContext, "网络请求超时");
        } else if (e instanceof HttpException || e instanceof UnknownHostException) {
            if (e.getMessage() != null && e.getMessage().contains("500")) {
                ToastUtil.showTipsToast(mContext, "服务器内部错误");
            } else {
                ToastUtil.showTipsToast(mContext, "网络请求错误");
            }
        } else if (e instanceof EOFException) {
            ToastUtil.showTipsToast(mContext, "数据错误");
        } else {
            ToastUtil.showTipsToast(mContext, e.getMessage());
        }
    }

    @Override
    public void onNext(T t) {

    }
}
