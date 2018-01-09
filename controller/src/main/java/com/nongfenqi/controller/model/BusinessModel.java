package com.nongfenqi.controller.model;

import java.util.List;
import java.util.Map;

/**
 * 报表数据
 *
 * @author guixiaoyuan
 * @version 2.3, 2017/9/5
 * @since [sherlock/V2.3.0]
 */
public class BusinessModel<T> {
    private static final String TAG = BusinessModel.class.getSimpleName();

    private String reportId;
    private int totalCount;
    private List<T> dataList;

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
