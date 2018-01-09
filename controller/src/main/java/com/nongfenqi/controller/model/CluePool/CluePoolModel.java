package com.nongfenqi.controller.model.CluePool;

import java.util.List;

/**
 *
 * 线索池
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/10/10
 * @since [sherlock/V2.2.5]
 */
public class CluePoolModel {
    /**
     * items : [{"addTime":"2017-03-06 09:53:00","addUserId":"U00000000100","addUserName":"赵一",
     * "applyId":"ED20170302108561","areaName":"玄武区","customerId":"C00000000126","customerName":"张三",
     * "desc":"客户包了100亩地，想买农机","managerUserId":"U00000000126","managerUserName":"小明",
     * "receiveState":{"id":0,"name":"string"},"receiveTime":"2017-03-06 09:53:00","receiveUserId":"U00000000101",
     * "receiveUserName":"赵二","typeDesc":"农机手"}]
     *
     * pageSize : 0
     * totalCount : 0
     */
    private int pageSize;
    private int totalCount;
    private List<CluePoolDetailModel> items;

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

    public List<CluePoolDetailModel> getItems() {
        return items;
    }

    public void setItems(List<CluePoolDetailModel> items) {
        this.items = items;
    }
}
