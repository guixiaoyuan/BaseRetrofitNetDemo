package com.nongfenqi.controller;

import android.content.Context;
import android.support.annotation.NonNull;

import com.nongfenqi.library.tools.LogcatUtil;
import com.nongfenqi.library.tools.ToastUtil;
import com.nongfenqi.library.view.LoadingDialog;

import org.apache.commons.lang3.StringUtils;

import java.io.EOFException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 21/10/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public abstract class BaseSubscriber<T> extends Subscriber<T> {
    private static String tag = BaseSubscriber.class.getSimpleName();

    private Context context;

    private LoadingDialog dialog;

    private boolean needDialog;

    private boolean needShowErrorMsg;

    public BaseSubscriber(Context context) {
        this(context, tag, true, true, null);
    }

    public BaseSubscriber(Context context, String tag) {
        this(context, tag, true, true, null);
    }


    public BaseSubscriber(Context context, boolean needShowErrorMsg) {
        this(context, tag, true, needShowErrorMsg, null);
    }

    public BaseSubscriber(Context context, String tag, boolean needDialog) {
        this(context, tag, needDialog, true, null);
    }

    public BaseSubscriber(Context context, String tag, String dialogMsg) {
        this(context, tag, true, true, dialogMsg);
    }

    public BaseSubscriber(@NonNull Context context, String mTag, boolean needDialog, boolean needShowErrorMsg, String dialogMsg) {
        this.context = context;
        tag = mTag;
        this.needDialog = needDialog;
        this.needShowErrorMsg = needShowErrorMsg;

        if (needDialog) {
            dialog = new LoadingDialog(context);
            if (!StringUtils.isEmpty(dialogMsg)) {
                dialog.setLoadingText(dialogMsg);
            }
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        if (needDialog && dialog != null) {
            LogcatUtil.d(tag, "dialog from " + tag);
            dialog.show();
        }
    }

    @Override
    public void onCompleted() {
        if (needDialog && dialog != null) {
            // 在umeng错误中出现了错误。。http://mobile.umeng.com/apps/0c1200b4cce85e76ff594f65/error_types/show?error_type_id=56f495ff67e58ecc4b0021c0_3184321338013934672_1.0.3
            try {
                dialog.dismiss();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } finally {
                dialog.dismiss();
            }
        }
        LogcatUtil.d(tag, " onCompleted");
    }

    @Override
    public void onError(Throwable e) {
        if (e == null || context == null) {
            return;
        }
        if (needDialog) {
            try {
                dialog.dismiss();
            } catch (IllegalArgumentException exception) {
                exception.printStackTrace();
            } finally {
                dialog.dismiss();
            }
        }
        if (needShowErrorMsg) {
            if (BuildConfig.DEBUG) {
                ToastUtil.showTipsToast(context, e.getMessage());
            } else if (e instanceof SocketTimeoutException) {
                ToastUtil.showTipsToast(context, "网络请求超时");
            } else if (e instanceof HttpException || e instanceof UnknownHostException) {
                if (e.getMessage() != null && e.getMessage().contains("500")) {
                    ToastUtil.showTipsToast(context, "服务器内部错误");
                } else {
                    ToastUtil.showTipsToast(context, "网络请求错误");
                }
//        } else if (e instanceof ApiException && e.getMessage().equals("认证失败")) {
//            do nothing 因为在MainActivity中已经弹出了Toast
            } else if (e instanceof EOFException) {
                ToastUtil.showTipsToast(context, "数据错误");
            } else {
                ToastUtil.showTipsToast(context, e.getMessage());
            }
        }
        e.printStackTrace();
    }

    @Override
    public void onNext(T t) {
        if (t != null) {
            LogcatUtil.d(tag, " onNext:" + t.toString());
        } else {
            LogcatUtil.d(tag, " onNext is null");
        }
    }

}
