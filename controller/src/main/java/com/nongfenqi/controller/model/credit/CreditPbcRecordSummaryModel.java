package com.nongfenqi.controller.model.credit;

import java.util.List;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 16/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class CreditPbcRecordSummaryModel {
    private static final String TAG = CreditPbcRecordSummaryModel.class.getSimpleName();


    /**
     * items : [{"addTime":"2016-11-16 09:38:37","expireDate":"2016-11-16 09:38:37","finishDate":"2016-11-16 09:38:37","id":1,"loanDate":"2016-11-16 09:38:37","loanPrincipal":150000,"loanSource":"中国农业银行","overdueExplain":"说明","remainPrincipal":80000,"state":false,"type":1}]
     * pageSize : 0
     * totalCount : 0
     */
    private int pageSize;
    private int totalCount;
    private List<CreditPbcRecordModel> items;

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

    public List<CreditPbcRecordModel> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "CreditPbcRecordSummaryModel{" +
                "pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", items=" + items +
                '}';
    }
}
