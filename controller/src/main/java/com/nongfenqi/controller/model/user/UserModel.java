package com.nongfenqi.controller.model.user;

import java.util.List;

/**
 * 用户
 *
 * @author luzhichao
 * @version 1.0, 17/3/22
 * @since [sherlock/V1.0.0]
 */

public class UserModel {
    private int pageSize;
    private int totalCount;
    private List<UserDetailModel> items;

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

    public List<UserDetailModel> getItems() {
        return items;
    }

    public void setItems(List<UserDetailModel> items) {
        this.items = items;
    }
}
