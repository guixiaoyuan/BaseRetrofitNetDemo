package com.nongfenqi.controller.http.quest;


import com.nongfenqi.controller.client.quest.RepaymentClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.repayment.DownPaymentModel;
import com.nongfenqi.controller.model.repayment.RepaymentScheduleModel;
import com.nongfenqi.controller.model.repayment.RepaymentScheduleResultModel;
import com.nongfenqi.controller.model.repayment.SplitDownPaymentModel;

import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Function
 * 还款计划
 *
 * @author jiezhi
 * @version 1.0, 13/12/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class RepaymentController {
    private static final String TAG = RepaymentController.class.getSimpleName();
    private String applyId;
    private RepaymentClient repaymentClient;

    public RepaymentController(String applyId) {
        this.applyId = applyId;
        repaymentClient = ServiceGenerator.createService(RepaymentClient.class);
    }


    /**
     * 设置申请单利率
     *
     * @param interestRate
     * @param subscriber
     */
    public void postRepaymentInterestRate(double interestRate, Subscriber<Object> subscriber) {
        repaymentClient.postRepaymentInterestRate(applyId, interestRate)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 查询申请单详情
     *
     * @param subscriber
     */
    public void getRepayment(Subscriber<List<DownPaymentModel>> subscriber) {
        repaymentClient.getRepayment(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<DownPaymentModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 生成还款计划预览
     *
     * @param repaymentScheduleModel
     * @param subscriber
     */
    public void postRepayment(RepaymentScheduleModel repaymentScheduleModel, Subscriber<RepaymentScheduleResultModel> subscriber) {
        repaymentClient.postRepayment(applyId, repaymentScheduleModel)
                .map(new ServiceGenerator.HttpResultFunc<RepaymentScheduleResultModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 查询还款计划和还款详情计划
     *
     * @param subscriber
     */
    public void getRepaymentSchedule(Subscriber<RepaymentScheduleResultModel> subscriber) {
        repaymentClient.getRepaymentSchedule(applyId)
                .map(new ServiceGenerator.HttpResultFunc<RepaymentScheduleResultModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 新增还款计划
     *
     * @param repaymentScheduleModel
     * @param subscriber
     */
    public void postRepaymentSchedule(RepaymentScheduleModel repaymentScheduleModel, Subscriber<Object> subscriber) {
        repaymentClient.postRepaymentSchedule(applyId, repaymentScheduleModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 生成首付拆分预览
     *
     * @param subscriber
     */
    public void postRepaymentDownPayment(Subscriber<List<DownPaymentModel>> subscriber) {
        repaymentClient.postRepaymentDownPayment(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<DownPaymentModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 确认首付拆分
     *
     * @param subscriber
     */
    public void postRepaymentDownPaymentSplit(List<SplitDownPaymentModel> splitDownPaymentModelList, Subscriber<Object> subscriber) {
        repaymentClient.postRepaymentDownPaymentSplit(applyId, splitDownPaymentModelList)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 取消首付拆分
     *
     * @param subscriber
     */
    public void postRepaymentDownPaymentRollback(Subscriber<Object> subscriber) {
        repaymentClient.postRepaymentDownPaymentRollback(applyId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
