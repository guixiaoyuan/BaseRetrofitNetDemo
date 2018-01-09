package com.nongfenqi.controller.http.quest;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.client.quest.OperateClient;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.operate.OperateEstimateBaseInfo;
import com.nongfenqi.controller.model.operate.OperateEstimateInfoModel;
import com.nongfenqi.controller.model.operate.OperateEstimatePlantModel;
import com.nongfenqi.controller.model.operate.OperateHistoryCropModel;
import com.nongfenqi.controller.model.operate.OperateHistoryCultivateModel;
import com.nongfenqi.controller.model.operate.OperateHistoryExpenseModel;
import com.nongfenqi.controller.model.operate.OperateHistoryIncomeModel;
import com.nongfenqi.controller.model.operate.OperateHistoryModel;
import com.nongfenqi.controller.model.operate.OperateHistoryOtherModel;
import com.nongfenqi.controller.model.operate.OperateHistoryReapModel;
import com.nongfenqi.controller.model.operate.OperateHistorySituationModel;
import com.nongfenqi.controller.model.operate.OperateHistorySummary;
import com.nongfenqi.controller.model.operate.OperateHistoryWorkModel;
import com.nongfenqi.controller.model.operate.OperateOwnerShipModel;
import com.nongfenqi.controller.model.operate.OperateSituationModel;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;


/**
 * Function
 * 获取，修改经营信息
 *
 * @author jiezhi
 * @version 1.0, 02/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class OperateController {
    private String applyId;

    private OperateClient operateClient;

    public OperateController(String applyId) {
        this.applyId = applyId;

        operateClient = ServiceGenerator.createService(OperateClient.class);
    }

    /**
     * 获取经营历史首页数据
     *
     * @param subscriber
     */
    public void getOperateHistorySummary(Subscriber<OperateHistorySummary> subscriber) {
        Observable<List<OperateHistoryModel>> getOperateHistory = operateClient.getOperateHistory(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<OperateHistoryModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        Observable<OperateSituationModel> getOperateSituation = operateClient.getOperateSituation(applyId)
                .map(new ServiceGenerator.HttpResultFunc<OperateSituationModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        Observable.zip(getOperateHistory, getOperateSituation,
                new Func2<List<OperateHistoryModel>, OperateSituationModel, OperateHistorySummary>() {
                    @Override
                    public OperateHistorySummary call(List<OperateHistoryModel> operateHistoryModels, OperateSituationModel operateSituationModel) {
                        OperateHistorySummary operateHistorySummary = new OperateHistorySummary();
                        operateHistorySummary.setOperateHistoryModelList(operateHistoryModels);
                        operateHistorySummary.setOperateSituationModel(operateSituationModel);
                        return operateHistorySummary;
                    }
                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询经营历史概况列表
     *
     * @param subscriber
     */
    public void getOperateHistory(Subscriber<List<OperateHistoryModel>> subscriber) {
        operateClient.getOperateHistory(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<OperateHistoryModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建经营历史概况
     *
     * @param operateHistorySituationModel
     * @param subscriber
     */
    public void postOperateHistorySituation(OperateHistorySituationModel operateHistorySituationModel, Subscriber<Integer> subscriber) {
        operateClient.postOperateHistorySituation(applyId, operateHistorySituationModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改经营历史概况
     *
     * @param operateHistorySituationModel
     * @param subscriber
     */
    public void putOperateHistorySituation(OperateHistorySituationModel operateHistorySituationModel, Subscriber<Object> subscriber) {
        operateClient.putOperateHistorySituation(applyId, operateHistorySituationModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询单条经营历史概况
     *
     * @param id
     * @param subscriber
     */
    public void getOperateHistorySituationById(int id, Subscriber<OperateHistorySituationModel> subscriber) {
        operateClient.getOperateHistorySituationById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<OperateHistorySituationModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除经营历史概况
     *
     * @param operateHistorySituationId
     * @param subscriber
     */
    public void deleteOperateHistorySituation(int operateHistorySituationId, Subscriber<Object> subscriber) {
        operateClient.deleteOperateHistorySituation(applyId, operateHistorySituationId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建大额支出详情
     *
     * @param operateHistoryExpenseModel
     * @param subscriber
     */
    public void postOperateHistoryExpense(OperateHistoryExpenseModel operateHistoryExpenseModel, Subscriber<Integer> subscriber) {
        operateClient.postOperateHistoryExpense(applyId, operateHistoryExpenseModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改大额支出详情
     *
     * @param operateHistoryExpenseModel
     * @param subscriber
     */
    public void putOperateHistoryExpense(OperateHistoryExpenseModel operateHistoryExpenseModel, Subscriber<Object> subscriber) {
        operateClient.putOperateHistoryExpense(applyId, operateHistoryExpenseModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除大额支出详情
     *
     * @param operateHistorySituationId
     * @param expenseId
     * @param subscriber
     */
    public void deleteOperateHistoryExpense(int operateHistorySituationId, int expenseId, Subscriber<Object> subscriber) {
        operateClient.deleteOperateHistoryExpense(applyId, operateHistorySituationId, expenseId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询单条大额支出详情
     *
     * @param expenseId
     * @param subscriber
     */
    public void getOperateHistoryExpense(int expenseId, Subscriber<OperateHistoryExpenseModel> subscriber) {
        operateClient.getOperateHistoryExpense(applyId, expenseId)
                .map(new ServiceGenerator.HttpResultFunc<OperateHistoryExpenseModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询大额支出详情列表
     *
     * @param operateHistorySituationId
     * @param subscriber
     */
    public void getOperateHistoryExpenseSituation(int operateHistorySituationId, Subscriber<List<OperateHistoryExpenseModel>> subscriber) {
        operateClient.getOperateHistoryExpenseSituation(applyId, operateHistorySituationId)
                .map(new ServiceGenerator.HttpResultFunc<List<OperateHistoryExpenseModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询收入详情列表
     *
     * @param operateHistorySituationId
     * @param subscriber
     */
    public void getOperateHistoryIncomeSituation(int operateHistorySituationId, Subscriber<List<OperateHistoryIncomeModel>> subscriber) {
        operateClient.getOperateHistoryIncomeSituation(applyId, operateHistorySituationId)
                .map(new ServiceGenerator.HttpResultFunc<List<OperateHistoryIncomeModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //------------查询种植经营历史---------

    /**
     * 查询种植经营历史
     *
     * @param operateHistoryId
     * @param subscriber
     */
    public void getOperateHistoryCrop(int operateHistoryId, Subscriber<OperateHistoryCropModel> subscriber) {
        operateClient.getOperateHistoryCrop(applyId, operateHistoryId)
                .map(new ServiceGenerator.HttpResultFunc<OperateHistoryCropModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建种植经营历史
     *
     * @param operateHistoryCropModel
     * @param subscriber
     */
    public void postOperateHistoryCrop(OperateHistoryCropModel operateHistoryCropModel, Subscriber<Integer> subscriber) {
        operateClient.postOperateHistoryCrop(applyId, operateHistoryCropModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改种植经营历史
     *
     * @param operateHistoryCropModel
     * @param subscriber
     */
    public void putOperateHistoryCrop(OperateHistoryCropModel operateHistoryCropModel, Subscriber<Object> subscriber) {
        operateClient.putOperateHistoryCrop(applyId, operateHistoryCropModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //------------养殖经营历史---------

    /**
     * 查询养殖经营历史
     *
     * @param operateHistoryId
     * @param subscriber
     */
    public void getOperateHistoryCultivate(int operateHistoryId, Subscriber<OperateHistoryCultivateModel> subscriber) {
        operateClient.getOperateHistoryCultivate(applyId, operateHistoryId)
                .map(new ServiceGenerator.HttpResultFunc<OperateHistoryCultivateModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建养殖经营历史
     *
     * @param operateHistoryCultivateModel
     * @param subscriber
     */
    public void postOperateHistoryCultivate(OperateHistoryCultivateModel operateHistoryCultivateModel, Subscriber<Integer> subscriber) {
        operateClient.postOperateHistoryCultivate(applyId, operateHistoryCultivateModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改养殖经营历史
     *
     * @param operateHistoryCultivateModel
     * @param subscriber
     */
    public void putOperateHistoryCultivate(OperateHistoryCultivateModel operateHistoryCultivateModel, Subscriber<Object> subscriber) {
        operateClient.putOperateHistoryCultivate(applyId, operateHistoryCultivateModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //------------其他经营历史---------

    /**
     * 查询其他经营历史
     *
     * @param operateHistoryId
     * @param subscriber
     */
    public void getOperateHistoryOther(int operateHistoryId, Subscriber<OperateHistoryOtherModel> subscriber) {
        operateClient.getOperateHistoryOther(applyId, operateHistoryId)
                .map(new ServiceGenerator.HttpResultFunc<OperateHistoryOtherModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建其他经营历史
     *
     * @param operateHistoryOtherModel
     * @param subscriber
     */
    public void postOperateHistoryOther(OperateHistoryOtherModel operateHistoryOtherModel, Subscriber<Integer> subscriber) {
        operateClient.postOperateHistoryOther(applyId, operateHistoryOtherModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改其他经营历史
     *
     * @param operateHistoryOtherModel
     * @param subscriber
     */
    public void putOperateHistoryOther(OperateHistoryOtherModel operateHistoryOtherModel, Subscriber<Object> subscriber) {
        operateClient.putOperateHistoryOther(applyId, operateHistoryOtherModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //------------收割经营历史---------

    /**
     * 查询收割经营历史
     *
     * @param operateHistoryId
     * @param subscriber
     */
    public void getOperateHistoryReap(int operateHistoryId, Subscriber<OperateHistoryReapModel> subscriber) {
        operateClient.getOperateHistoryReap(applyId, operateHistoryId)
                .map(new ServiceGenerator.HttpResultFunc<OperateHistoryReapModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建收割经营历史
     *
     * @param operateHistoryReapModel
     * @param subscriber
     */
    public void postOperateHistoryReap(OperateHistoryReapModel operateHistoryReapModel, Subscriber<Integer> subscriber) {
        operateClient.postOperateHistoryReap(applyId, operateHistoryReapModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改收割经营历史
     *
     * @param operateHistoryReapModel
     * @param subscriber
     */
    public void putOperateHistoryReap(OperateHistoryReapModel operateHistoryReapModel, Subscriber<Object> subscriber) {
        operateClient.putOperateHistoryReap(applyId, operateHistoryReapModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //------------打工经营历史---------

    /**
     * 查询打工经营历史
     *
     * @param operateHistoryId
     * @param subscriber
     */
    public void getOperateHistoryWork(int operateHistoryId, Subscriber<OperateHistoryWorkModel> subscriber) {
        operateClient.getOperateHistoryWork(applyId, operateHistoryId)
                .map(new ServiceGenerator.HttpResultFunc<OperateHistoryWorkModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建打工经营历史
     *
     * @param operateHistoryWorkModel
     * @param subscriber
     */
    public void postOperateHistoryWork(OperateHistoryWorkModel operateHistoryWorkModel, Subscriber<Integer> subscriber) {
        operateClient.postOperateHistoryWork(applyId, operateHistoryWorkModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改打工经营历史
     *
     * @param operateHistoryWorkModel
     * @param subscriber
     */
    public void putOperateHistoryWork(OperateHistoryWorkModel operateHistoryWorkModel, Subscriber<Object> subscriber) {
        operateClient.putOperateHistoryWork(applyId, operateHistoryWorkModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除经营历史
     *
     * @param operateHistorySituationId
     * @param operateHistoryId
     * @param subscriber
     */
    public void deleteOperateHistory(int operateHistorySituationId, int operateHistoryId, Subscriber<Object> subscriber) {
        operateClient.deleteOperateIncomeHistory(applyId, operateHistorySituationId, operateHistoryId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //------------经营状况---------

    /**
     * 查询经营状况
     *
     * @param subscriber
     */
    public void getOperateSituation(Subscriber<OperateSituationModel> subscriber) {
        operateClient.getOperateSituation(applyId)
                .map(new ServiceGenerator.HttpResultFunc<OperateSituationModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建经营状况信息
     *
     * @param operateSituationModel
     * @param subscriber
     */
    public void postOperateSituation(OperateSituationModel operateSituationModel, Subscriber<Integer> subscriber) {
        operateClient.postOperateSituation(applyId, operateSituationModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改经营状况
     *
     * @param operateSituationModel
     * @param subscriber
     */
    public void putOperateSituation(OperateSituationModel operateSituationModel, Subscriber<Object> subscriber) {
        operateClient.putOperateSituation(applyId, operateSituationModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //------------经营权属---------

    /**
     * 查询权属状况
     *
     * @param subscriber
     */
    public void getOperateOwnerShip(Subscriber<OperateOwnerShipModel> subscriber) {
        operateClient.getOperateOwnerShip(applyId)
                .map(new ServiceGenerator.HttpResultFunc<OperateOwnerShipModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建经营权属信息
     *
     * @param operateSituationModel
     * @param subscriber
     */
    public void postOperateOwnerShip(OperateOwnerShipModel operateSituationModel, Subscriber<Integer> subscriber) {
        operateClient.postOperateOwnerShip(applyId, operateSituationModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改经营权属
     *
     * @param operateSituationModel
     * @param subscriber
     */
    public void putOperateOwnerShip(OperateOwnerShipModel operateSituationModel, Subscriber<Object> subscriber) {
        operateClient.putOperateOwnerShip(applyId, operateSituationModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 经营信息图片上传
     * upload image to operate info
     *
     * @param filePathList
     * @param subscriber
     */
    public void uploadOperateImages(List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return operateClient.postOperatePic(applyId, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

    /**
     * 经营权属图片上传
     * upload image to operate info
     *
     * @param filePathList
     * @param subscriber
     */
    public void uploadOperateOwnerImages(List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return operateClient.postOperateOwnerShipPic(applyId, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

    /**
     * 查询经营预估信息
     *
     * @param subscriber
     */
    public void getOperateEstimateInfo(Subscriber<OperateEstimateInfoModel> subscriber) {
        operateClient.getOperateEstimate(applyId)
                .map(new ServiceGenerator.HttpResultFunc<OperateEstimateInfoModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建经营预估信息
     *
     * @param info
     */
    public void createOperateEstimateInfo(OperateEstimateBaseInfo info, Subscriber<String> subscriber) {
        operateClient.postOperateEstimate(applyId, info)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改经营预估信息
     *
     * @param info
     * @param subscriber
     */
    public void putOperateEstimateInfo(OperateEstimateBaseInfo info, Subscriber<String> subscriber) {
        operateClient.putOperateEstimate(applyId, info)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建经营预估种植信息
     *
     * @param subscriber
     */
    public void createOperateEstimatePlantInfo(OperateEstimatePlantModel model, Subscriber<String> subscriber) {
        operateClient.postOperateEstimatePlant(applyId, model)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改经营预估种植信息
     *
     * @param subscriber
     */
    public void putOperateEstimatePlantInfo(OperateEstimatePlantModel model, Subscriber<String> subscriber) {
        operateClient.putOperateEstimatePlant(applyId, model)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除经营预估种植信息
     *
     * @param operateGrowInfoId
     * @param subscriber
     */
    public void deleteOperateEstimatePlantInfo(int operateGrowInfoId, Subscriber<String> subscriber) {
        operateClient.deleteOperateEstimatePlant(applyId, operateGrowInfoId)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 生成经营预估区间预览
     *
     * @param subscriber
     */
    public void postEstimateSectionPreview(Subscriber<OperateEstimateInfoModel> subscriber) {
        operateClient.postOperateEstimateSectionPreview(applyId)
                .map(new ServiceGenerator.HttpResultFunc<OperateEstimateInfoModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 保存经营预估区间
     *
     * @param subscriber
     */
    public void postEstimateSection(Subscriber<String> subscriber) {
        operateClient.postOperateEstimateSection(applyId)
                .map(new ServiceGenerator.HttpResultFunc<String>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
