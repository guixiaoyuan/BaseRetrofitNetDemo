package com.nongfenqi.controller.model.business;

import java.util.List;

/**
 * 申请单记录分页查询
 *
 * @author jiezhi
 * @version 1.0, 14/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class ApplyOrderRecordSummaryModel {
    private static final String TAG = ApplyOrderRecordSummaryModel.class.getSimpleName();

    /**
     * items : [{"applyId":"string","recordId":0,"remark":"string","stateId":"0:待提交, 1:已提交, 16:风控待审核, 17:风控审核通过, 18:风控审核不通过, 19:风控终止, 32:平台预审, 33:平台预审通过, 34:平台预审不通过, 48:合同已提交, 49:合同审核通过, 50:合同审核不通过, 64:下款中, 65:已下款, 66:下款失败","stateName":"string","time":"2016-11-18 14:18:55","userId":"string","userName":"string"}]
     * pageSize : 0
     * totalCount : 0
     */

    private int pageSize;
    private int totalCount;
    private List<ApplyOrderRecordModel> items;

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

    public List<ApplyOrderRecordModel> getItems() {
        return items;
    }

    public void setItems(List<ApplyOrderRecordModel> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ApplyOrderRecordSummaryModel{" +
                "pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", items=" + items +
                '}';
    }
}
