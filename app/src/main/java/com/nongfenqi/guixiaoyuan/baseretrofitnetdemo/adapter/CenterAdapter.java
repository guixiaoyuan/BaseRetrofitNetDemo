package com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.R;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model.CenterActivityModel;
import com.nongfenqi.guixiaoyuan.baseretrofitnetdemo.model.UrlConstant;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import org.apache.commons.lang3.StringUtils;


/**
 * 活动中心适配器
 *
 * @author guixy
 * @version 2.2, 13/07/17
 * @since [sherlock/V2.2.0]
 */
public class CenterAdapter extends RecyclerView.Adapter<CenterAdapter.CenterViewHolder> {
    private static final String TAG = CenterAdapter.class.getSimpleName();

    private Context mContext;
    private List<CenterActivityModel> mList;

    private OnCenterItemClickLister mOnCenterItemClickLister;

    private final static int STATE_NOT_BEGIN = 0;
    private final static int STATE_NOT_RUNNING = 2;
    private final static int STATE_NOT_END = 1;

    public CenterAdapter(Context context, List<CenterActivityModel> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public CenterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_center_activity, null);
        return new CenterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CenterViewHolder holder, final int position) {
        holder.mCenterTitle.setText(mList.get(position).getActivityName());
        int state = mList.get(position).getState();
        String title;
        int color;
        int backgroundRes;
        if (state == STATE_NOT_RUNNING) {
            title = "进行中";
            color = mContext.getResources().getColor(R.color.main_blue);
            backgroundRes = R.drawable.item_tag_view_blue_bg;
        } else if (state == STATE_NOT_END) {
            title = "已结束";
            color = mContext.getResources().getColor(R.color.text_hint_color);
            backgroundRes = R.drawable.item_state_center_activity;
        } else {
            title = "未开始";
            color = mContext.getResources().getColor(R.color.text_hint_color);
            backgroundRes = R.drawable.item_state_center_activity;
        }

        holder.mActivityStatus.setText(title);
        holder.mActivityStatus.setTextColor(color);
        holder.mActivityStatus.setBackgroundResource(backgroundRes);

        String imgPath = UrlConstant.SERVER_API_PIC + mList.get(position).getPicFileId();
        if (!StringUtils.isBlank(imgPath)) {
            Glide.with(mContext)
                    .load(imgPath)
                    .centerCrop()
                    .placeholder(R.drawable.iv_default_image_loading)
                    .error(R.drawable.iv_default_image_loading)
                    .crossFade()
                    .thumbnail(0.5f)
                    .into(holder.mCenterContent);
        }
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnCenterItemClickLister.onItemClick(mList.get(position).getActivityUrl(),
                        mList.get(position).getActivityName());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setOnCenterItemClickLister(OnCenterItemClickLister onCenterItemClickLister) {
        mOnCenterItemClickLister = onCenterItemClickLister;
    }

    public interface OnCenterItemClickLister {
        void onItemClick(String url, String name);
    }

    public class CenterViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_center_title)
        TextView mCenterTitle;
        @BindView(R.id.img_center_content)
        ImageView mCenterContent;
        @BindView(R.id.tv_activity_state)
        TextView mActivityStatus;
        @BindView(R.id.rl_center_item)
        View mView;

        public CenterViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
