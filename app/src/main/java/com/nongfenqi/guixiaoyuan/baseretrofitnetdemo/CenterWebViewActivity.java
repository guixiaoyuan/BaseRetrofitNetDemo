package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.FrameLayout;

import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.constant.CenterConstants;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 活动WebView界面
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/7/1
 * @since [sherlock/V2.2.0]
 */
public class CenterWebViewActivity extends BaseActivity {
    private static final String TAG = CenterWebViewActivity.class.getSimpleName();

    @BindView(R.id.wv_july_result)
    WebView mActivityWebView;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.fl_root_layout)
    FrameLayout mRootView;

    @BindView(R.id.app_bar)
    View mAppBar;

    private static final String JS_NAME = "android";
    private static final String ENCODING_NAME = "utf-8";

    private String mUrl;
    private boolean isAdvertisement;

    private float mFirstY;
    private float mCurrentY;

    @SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow_web_view);
        unbinder = ButterKnife.bind(this);
        mUrl = getIntent().getStringExtra(CenterConstants.ACTIVITY_URL);
        isAdvertisement = getIntent().getBooleanExtra("advertisement", false);
        mToolbar.setTitle(getIntent().getStringExtra(CenterConstants.ACTIVITY_NAME));
        mToolbar.setNavigationIcon(R.drawable.ic_real_name_back);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        setSupportActionBar(mToolbar);
        mActivityWebView.getSettings().setJavaScriptEnabled(true);
        mActivityWebView.addJavascriptInterface(context, JS_NAME);
        mActivityWebView.getSettings().setDefaultTextEncodingName(ENCODING_NAME);
        if (CenterConstants.SUMMER_ACTIVITY_URL.equals(mUrl)) {
            //mUrl = mUrl + CenterConstants.PAD_PARAMETER + SherlockApplication.getUserId();
        }
        mActivityWebView.loadUrl(mUrl);
        mActivityWebView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mFirstY = event.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        mCurrentY = event.getY();
                        if (mCurrentY - mFirstY > ViewConfiguration.get(context).getScaledTouchSlop()) {
                            // 下滑 显示titleBar
                            showHideTitleBar(true);
                        } else if (mFirstY - mCurrentY > ViewConfiguration.get(context).getScaledTouchSlop()) {
                            // 上滑 隐藏titleBar
                            showHideTitleBar(false);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
    }

    private Animator mAnimatorTitle;
    private Animator mAnimatorContent;

    private void showHideTitleBar(boolean tag) {
        if (mAnimatorTitle != null && mAnimatorTitle.isRunning()) {
            mAnimatorTitle.cancel();
        }
        if (mAnimatorContent != null && mAnimatorContent.isRunning()) {
            mAnimatorContent.cancel();
        }
        if (tag) {
            mAnimatorTitle = ObjectAnimator.ofFloat(mAppBar, View.TRANSLATION_Y, mAppBar.getTranslationY(), 0);
            mAnimatorContent = ObjectAnimator.ofFloat(mActivityWebView, View.TRANSLATION_Y, mActivityWebView.getTranslationY(), getResources().getDimension(R.dimen.title_height));

        } else {
            mAnimatorTitle = ObjectAnimator.ofFloat(mAppBar, View.TRANSLATION_Y, mAppBar.getTranslationY(), -mAppBar.getHeight());
            mAnimatorContent = ObjectAnimator.ofFloat(mActivityWebView, View.TRANSLATION_Y, mActivityWebView.getTranslationY(), 0);
        }
        mAnimatorTitle.start();
        mAnimatorContent.start();

    }



    @Override
    protected void onDestroy() {
        mRootView.removeView(mActivityWebView);
        mActivityWebView.removeAllViews();
        mActivityWebView.destroy();
        super.onDestroy();
    }

}
