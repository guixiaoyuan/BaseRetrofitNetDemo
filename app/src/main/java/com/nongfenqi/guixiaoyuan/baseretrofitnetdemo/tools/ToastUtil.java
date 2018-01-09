package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.tools;

import android.content.Context;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.github.johnpersano.supertoasts.SuperToast;


/**
 * 定制化toast
 *
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
 */
public class ToastUtil {
    private static final String TAG = ToastUtil.class.getSimpleName();
    public static final int VERY_SHORT = 1500;
    public static final int SHORT = 2000;
    public static final int MEDIUM = 2750;
    public static final int LONG = 3500;
    public static final int EXTRA_LONG = 4500;

    public static void showToastShort(Context context, CharSequence message) {
        Toast mToast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        mToast.setGravity(Gravity.BOTTOM, 0, 0);
        mToast.show();
    }

    public static void showToastLong(Context context, CharSequence message) {
        Toast mToast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        mToast.setGravity(Gravity.BOTTOM, 0, 0);
        mToast.show();
    }

    public static void showToastShort(Context context, int rId) {
        Toast mToast = Toast.makeText(context, rId,
                Toast.LENGTH_SHORT);
        mToast.setGravity(Gravity.BOTTOM, 0, 0);
        mToast.show();
    }

    /**
     * 带图标的吐司
     *
     * @param message
     * @param iconId
     */
    public static void showToastWithIcon(Context context, CharSequence message, int iconId) {
        Toast mToast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        LinearLayout toastView = (LinearLayout) mToast.getView();
        toastView.setOrientation(LinearLayout.HORIZONTAL);
        toastView.setGravity(Gravity.TOP);

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iconId);
        toastView.addView(imageView, 0);

        mToast.setGravity(Gravity.TOP, 0, 0);
        mToast.show();
    }

    /**
     * pad统一上方吐司提示信息
     *
     * @param context
     * @param info
     */
    public static void showTipsToast(Context context, String info) {
        showTipsToast(context, info, SHORT);
    }

    /**
     * pad统一上方吐司提示信息(长时间提示)
     *
     * @param context
     * @param info
     * @param durationType
     */
    public static void showTipsToast(Context context, String info, int durationType) {
        if (context == null) {
            return;
        }

        SuperToast superToast = new SuperToast(context);
        superToast.setDuration(durationType);

        superToast.setText(info);
        superToast.setGravity(Gravity.TOP, 0, 100);
        superToast.setIcon(SuperToast.Icon.Dark.INFO, SuperToast.IconPosition.LEFT);
        superToast.show();
    }

}
