package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.adapter.CenterAdapter;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.constant.CenterConstants;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.httpController.CenterActivityController;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model.BaseSubscriber;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model.CenterActivityModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 活动中心
 *
 * @author guixiaoyuan
 * @version 1.0, 2017/12/29
 * @since [BaseRetrofitNetDemo/V1.0]
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private static final int TYPE_CENTER_ACTIVITY = 2;

    @BindView(R.id.center_recycler)
    RecyclerView mCenterRV;

    @BindView(R.id.no_data)
    View mNoDataView;

    private CenterAdapter mCenterAdapter;
    private List<CenterActivityModel> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setActionBar("活动中心", true);
        getData();
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
        ColorDrawable drawable = new ColorDrawable(getResources().getColor(R.color.main_blue));
        return drawable;
    }

    private void initView() {
        mCenterAdapter = new CenterAdapter(this, mList);
        mCenterAdapter.setOnCenterItemClickLister(new CenterAdapter.OnCenterItemClickLister() {

            @Override
            public void onItemClick(String url, String name) {
                Intent intent = new Intent();
                intent.putExtra(CenterConstants.ACTIVITY_URL, url);
                intent.putExtra(CenterConstants.ACTIVITY_NAME, name);
                //intent.setClass(MainActivity.this, CenterWebViewActivity.class);
                startActivity(intent);
            }
        });
        mCenterRV.setLayoutManager(new LinearLayoutManager(this));
        mCenterRV.setAdapter(mCenterAdapter);
    }

    private void getData() {
        mList = new ArrayList<>();
        CenterActivityController.getAllCenterActivities(new BaseSubscriber<List<CenterActivityModel>>(this, TAG) {
            @Override
            public void onNext(List<CenterActivityModel> centerActivityModels) {
                super.onNext(centerActivityModels);
                if (centerActivityModels != null && centerActivityModels.size() > 0) {
                    mNoDataView.setVisibility(View.GONE);
                    for (int i = 0; i < centerActivityModels.size(); i++) {
                        if (centerActivityModels.get(i).getType() == TYPE_CENTER_ACTIVITY) {
                            mList.add(centerActivityModels.get(i));
                        }
                    }
                    initView();
                } else {
                    mNoDataView.setVisibility(View.VISIBLE);
                    mCenterRV.setVisibility(View.GONE);
                }
            }
        });
    }
}
