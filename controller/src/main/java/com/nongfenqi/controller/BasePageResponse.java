package com.nongfenqi.controller;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 分页结果包装类
 *
 * @author jiezhi
 * @version 1.0, 10/04/2017
 * @since [sherlock/V1.0.0]
 */
public class BasePageResponse<T> {
    private static final String TAG = BasePageResponse.class.getSimpleName();

    /**
     * items : T
     * pageSize : 0
     * totalCount : 0
     */
    @SerializedName("pageSize")
    private int pageSize;
    @SerializedName("totalCount")
    private int totalCount;
    @SerializedName("items")
    private List<T> items;

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

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
