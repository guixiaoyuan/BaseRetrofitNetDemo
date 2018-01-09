package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.WindowManager;
import android.widget.TextView;

import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.R;


/**
 * 默认的数据加载等待弹窗
 *
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
 */

public class LoadingDialog extends ProgressDialog {
    private TextView dialogMsgTV;

    public LoadingDialog(Context context) {
        super(context, R.style.CustomerProgressDialog);
        if (context != null) {
            initViews();
        }
    }

    private void initViews() {
        show();
        setContentView(R.layout.dialog_loading);
        dialogMsgTV = (TextView) findViewById(R.id.tv_loading_text);
        if (getWindow() == null) {
            return;
        }
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = WindowManager.LayoutParams.MATCH_PARENT;
        getWindow().setAttributes(params);

        setCanceledOnTouchOutside(false);
    }

    /**
     * 设置加载提示
     *
     * @param msg
     */
    public void setLoadingText(String msg) {
        dialogMsgTV.setText(msg);
    }
}
