package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import butterknife.Unbinder;

/**
 * 基准Activity
 *F
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
 */
public abstract class BaseActivity extends AppCompatActivity {
    private static final String TAG = BaseActivity.class.getSimpleName();

    protected Context context;
    protected Unbinder unbinder;

    protected boolean isOptionMenuVisible = true;//标示是否要显示optionMenu
    protected Menu mMenu;//获取optionMenu

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (isFixedOrientation()) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
        }
        context = this;

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * menu的隐藏显示控制
     */
    protected void checkOptionMenu() {
        if (null != mMenu) {
            for (int i = 0, m = mMenu.size(); i < m; i++) {
                mMenu.getItem(i).setVisible(isOptionMenuVisible);
                mMenu.getItem(i).setEnabled(isOptionMenuVisible);
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
        context = null;
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    protected void setActionBar(String title) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(title);
            actionBar.setBackgroundDrawable(getBarColorDrawable());
            actionBar.setElevation(0);
        }
    }

    protected void setActionBar(String title, boolean displayHomeAsUpEnabled) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(title);
            actionBar.setDisplayHomeAsUpEnabled(displayHomeAsUpEnabled);
            actionBar.setBackgroundDrawable(getBarColorDrawable());
            actionBar.setElevation(0);
        }
    }

    private Drawable getBarColorDrawable() {
        ColorDrawable drawable;
        drawable = new ColorDrawable(getResources().getColor(R.color.main_blue));
        return drawable;
    }

    //点击空白区域清除软键盘
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if (null != v) {
                InputMethodManager mInputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                return mInputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
            }
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        mMenu = menu;
        checkOptionMenu();
        return super.onPrepareOptionsMenu(menu);
    }

    /**
     * 返回按钮的处理
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    protected boolean isFixedOrientation() {
        return false;
    }
}
