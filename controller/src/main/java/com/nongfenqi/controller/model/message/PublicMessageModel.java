package com.nongfenqi.controller.model.message;

import java.util.List;

/**
 *
 * 公告消息模型
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/10/10
 * @since [sherlock/V2.2.5]
 */
public class PublicMessageModel {
    private int pageSize;
    private List<MessageDetailModel> items;
    private int totalCount;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<MessageDetailModel> getItems() {
        return items;
    }

    public void setItems(List<MessageDetailModel> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "pageSize = "+ pageSize +" /n" +
                "totalCount = " + totalCount + "/n" +
                "items = " + items.toString();
    }
}

