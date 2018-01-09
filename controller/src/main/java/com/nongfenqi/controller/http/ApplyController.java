package com.nongfenqi.controller.http;


import com.nongfenqi.controller.BasePageResponse;
import com.nongfenqi.controller.client.ApplyClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.business.ApplyControlExtModel;
import com.nongfenqi.controller.model.business.ApplyControlRecordModel;
import com.nongfenqi.controller.model.business.ApplyItemModel;
import com.nongfenqi.controller.model.business.ApplyManagerModel;
import com.nongfenqi.controller.model.business.ApplyOrderModel;
import com.nongfenqi.controller.model.business.ApplyOrderRecordModel;
import com.nongfenqi.controller.model.business.ApplyOrderRecordSummaryModel;
import com.nongfenqi.controller.model.business.ApplyOrderStartModel;
import com.nongfenqi.controller.model.business.ApplyPreUseModel;
import com.nongfenqi.controller.model.business.BusinessTemplateModel;
import com.nongfenqi.controller.model.business.StateCountModel;

import java.util.List;
import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Function
 * 申请单接口
 *
 * @author jiezhi
 * @version 1.0, 17/10/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public class ApplyController {
    private String applyId;
    private ApplyClient applyClient;

    public ApplyController(String applyId) {
        this.applyId = applyId;

        applyClient = ServiceGenerator.createService(ApplyClient.class);
    }

    /**
     * 申请单模板查询
     *
     * @param subscriber
     */
    public static void getTemplate(Subscriber<List<BusinessTemplateModel>> subscriber) {
        ServiceGenerator.createService(ApplyClient.class).getConfigTemplate()
                .map(new ServiceGenerator.HttpResultFunc<List<BusinessTemplateModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 申请单查询
     *
     * @param options
     * @param subscriber
     */
    public static void getApplyOrder(Map<String, String> options, Subscriber<BasePageResponse<ApplyOrderModel>> subscriber) {
        ApplyClient applyClient = ServiceGenerator.createService(ApplyClient.class);
        applyClient.getApplyOrder(options)
                .map(new ServiceGenerator.HttpResultFunc<BasePageResponse<ApplyOrderModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 申请单查询
     *
     * @param subscriber
     */
    public void getApplyOrderById(Subscriber<ApplyOrderModel> subscriber) {
        applyClient.getApplyOrderById(applyId)
                .map(new ServiceGenerator.HttpResultFunc<ApplyOrderModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建申请单
     *
     * @param applyOrderStartModel
     * @param subscriber
     */
    public static void postApplyOrder(ApplyOrderStartModel applyOrderStartModel, Subscriber<String> subscriber) {
        ApplyClient applyClient = ServiceGenerator.createService(ApplyClient.class);
        applyClient.postApplyOrder(applyOrderStartModel)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 申请单记录分页查询
     *
     * @param options
     * @param subscriber
     */
    public static void getApplyOrderRecord(Map<String, String> options, Subscriber<ApplyOrderRecordSummaryModel> subscriber) {
        ApplyClient applyClient = ServiceGenerator.createService(ApplyClient.class);
        applyClient.getApplyOrderRecord(options)
                .map(new ServiceGenerator.HttpResultFunc<ApplyOrderRecordSummaryModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 申请单状态数量查询
     *
     * @param options
     * @param subscriber
     */
    public static void getApplyOrderStateCount(Map<String, String> options, Subscriber<List<StateCountModel>> subscriber) {
        ApplyClient applyClient = ServiceGenerator.createService(ApplyClient.class);
        applyClient.getApplyOrderStateCount(options)
                .map(new ServiceGenerator.HttpResultFunc<List<StateCountModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 申请单流程纪录列表查询
     *
     * @param subscriber
     */
    public void getApplyOrderRecord(Subscriber<List<ApplyOrderRecordModel>> subscriber) {
        applyClient.getApplyOrderRecord(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<ApplyOrderRecordModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 申请单流程纪录列表查询
     *
     * @param recordId
     * @param subscriber
     */
    public void getApplyControlRecord(int recordId, Subscriber<ApplyControlRecordModel> subscriber) {
        applyClient.getApplyControlRecord(applyId, recordId)
                .map(new ServiceGenerator.HttpResultFunc<ApplyControlRecordModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 申请单控制记录扩展查询
     *
     * @param subscriber
     */
    public void getApplyControlExt(Subscriber<ApplyControlExtModel> subscriber) {
        applyClient.getApplyControlExt(applyId)
                .map(new ServiceGenerator.HttpResultFunc<ApplyControlExtModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 提交申请单
     *
     * @param remark     备注
     * @param subscriber
     */
    public void commitApply(String remark, Subscriber<Integer> subscriber) {
        applyClient.commitApply(applyId, remark)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 申请业务单重审
     *
     * @param remark     备注
     * @param subscriber
     */
    public void rollbackApply(String remark, Subscriber<Integer> subscriber) {
        applyClient.rollbackApply(applyId, remark)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 撤回申请单
     *
     * @param subscriber
     */
    public void undoApply(Subscriber<Integer> subscriber) {
        applyClient.undoApply(applyId)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 提交合同
     *
     * @param subscriber
     */
    public void commitApplyContract(Subscriber<Integer> subscriber) {
        applyClient.commitApplyContract(applyId)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 否决申请单
     *
     * @param remark
     * @param subscriber
     */
    public void stopApply(String remark, Subscriber<Integer> subscriber) {
        applyClient.stopApply(applyId, remark)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 恢复申请单
     *
     * @param remark
     * @param subscriber
     */
    public void recoverApply(String remark, Subscriber<Integer> subscriber) {
        applyClient.recoverApply(applyId, remark)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 项目查询
     *
     * @param subscriber
     */
    public void getApplyItems(Subscriber<List<ApplyItemModel>> subscriber) {
        applyClient.getApplyItems(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<ApplyItemModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 变更申请单模板
     *
     * @param subscriber
     */
    public void changeApplyTemplate(String templateId, Subscriber<Object> subscriber) {
        applyClient.changeApplyTemplate(applyId, templateId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 变更申请单负责人
     *
     * @param applyManagerModel
     * @param subscriber
     */
    public void changeApplyManager(ApplyManagerModel applyManagerModel, Subscriber<Object> subscriber) {
        applyClient.changeApplyManager(applyId, applyManagerModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 变更申请单负责人
     *
     * @param subscriber
     */
    public void changeApplyManager(Map<String, String> queryOptions, Subscriber<Object> subscriber) {
        applyClient.changeApplyManager(applyId, queryOptions)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 变更申请单调查表
     */
    public void changeApplyItemTemplate(List<String> itemIds, Subscriber<Object> subscriber) {
        applyClient.changeApplyItemTemplate(applyId, itemIds)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /*-----------------------------------预申请信息----------------------------------------------------*/

    /**
     * 查询申请单预申请信息
     *
     * @param subscriber
     */
    public void getApplyPreUse(Subscriber<ApplyPreUseModel> subscriber) {
        applyClient.getApplyPreUse(applyId)
                .map(new ServiceGenerator.HttpResultFunc<ApplyPreUseModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * @param applyPreUseModel
     * @param subscriber
     */
    public void patchApplyPreUse(ApplyPreUseModel applyPreUseModel, Subscriber<Object> subscriber) {
        applyClient.patchApplyPreUse(applyId, applyPreUseModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
