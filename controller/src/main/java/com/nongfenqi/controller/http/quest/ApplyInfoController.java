package com.nongfenqi.controller.http.quest;

import com.nongfenqi.controller.client.quest.ApplyUseClient;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.quest.ApplyArtificialModel;
import com.nongfenqi.controller.model.quest.ApplyMachineModel;
import com.nongfenqi.controller.model.quest.ApplyFarmWorkModel;
import com.nongfenqi.controller.model.quest.ApplyFoodStuffModel;
import com.nongfenqi.controller.model.quest.ApplyLandModel;
import com.nongfenqi.controller.model.quest.ApplyMaterialsModel;
import com.nongfenqi.controller.model.quest.ApplyUseMaterialModel;
import com.nongfenqi.controller.model.quest.ApplyUseModel;
import com.nongfenqi.controller.model.quest.ApplyUseOtherModel;
import com.nongfenqi.controller.model.quest.MarginPayeeModel;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 申请用途业务
 *
 * @author jiezhi
 * @version 1.0, 06/12/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class ApplyInfoController {
    private static final String TAG = ApplyInfoController.class.getSimpleName();

    private String applyId;
    private ApplyUseClient applyUseClient;

    public ApplyInfoController(String applyId) {
        this.applyId = applyId;

        applyUseClient = ServiceGenerator.createService(ApplyUseClient.class);
    }

    /**
     * 申请信息查询
     *
     * @param subscriber
     */
    public void getApplyUseInfo(Subscriber<ApplyUseModel> subscriber) {
        applyUseClient.getApplyUseInfo(applyId)
                .map(new ServiceGenerator.HttpResultFunc<ApplyUseModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询申请金额
     *
     * @param subscriber
     */
    public void getApplyAmount(Subscriber<Float> subscriber) {
        applyUseClient.getApplyAmount(applyId)
                .map(new ServiceGenerator.HttpResultFunc<Float>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建土地租金申请用途
     *
     * @param applyUseLandModel
     * @param subscriber
     */
    public void postApplyUseLand(ApplyLandModel applyUseLandModel, Subscriber<Object> subscriber) {
        applyUseClient.postApplyUseLand(applyId, applyUseLandModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改土地租金申请用途
     *
     * @param applyUseLandModel
     * @param subscriber
     */
    public void putApplyUseLand(ApplyLandModel applyUseLandModel, Subscriber<Object> subscriber) {
        applyUseClient.putApplyUseLand(applyId, applyUseLandModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建农机申请用途
     *
     * @param applyUseMachineModel
     * @param subscriber
     */
    public void postApplyUseMachine(ApplyMachineModel applyUseMachineModel, Subscriber<Object> subscriber) {
        applyUseClient.postApplyUseMachine(applyId, applyUseMachineModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改农机申请用途
     *
     * @param applyUseMachineModel
     * @param subscriber
     */
    public void putApplyUseMachine(ApplyMachineModel applyUseMachineModel, Subscriber<Object> subscriber) {
        applyUseClient.putApplyUseMachine(applyId, applyUseMachineModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建农资申请用途
     *
     * @param applyUseMaterialModel
     * @param subscriber
     */
    public void postApplyUseMaterial(ApplyUseMaterialModel applyUseMaterialModel, Subscriber<Object> subscriber) {
        applyUseClient.postApplyUseMaterial(applyId, applyUseMaterialModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改农资申请用途
     *
     * @param applyUseMaterialModel
     * @param subscriber
     */
    public void putApplyUseMaterial(ApplyMaterialsModel applyUseMaterialModel, Subscriber<Object> subscriber) {
        applyUseClient.putApplyUseMaterial(applyId, applyUseMaterialModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建其他申请用途
     *
     * @param applyUseOtherModel
     * @param subscriber
     */
    public void postApplyUseOther(ApplyUseOtherModel applyUseOtherModel, Subscriber<Object> subscriber) {
        applyUseClient.postApplyUseOther(applyId, applyUseOtherModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改其他申请用途
     *
     * @param applyUseOtherModel
     * @param subscriber
     */
    public void putApplyUseOther(ApplyUseOtherModel applyUseOtherModel, Subscriber<Object> subscriber) {
        applyUseClient.putApplyUseOther(applyId, applyUseOtherModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /*---------------------------信贷----------------------------------------*/

    /**
     * 修改人工分期
     */
    public void putApplyArtificial(ApplyArtificialModel applyArtificialModel, Subscriber<Object> subscriber) {
        applyUseClient.putApplyArtificial(applyId, applyArtificialModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改农活分期
     */
    public void putApplyFarmWork(ApplyFarmWorkModel applyFarmWorkModel, Subscriber<Object> subscriber) {
        applyUseClient.putApplyFarmWork(applyId, applyFarmWorkModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改粮食分期
     */
    public void putApplyFoodStuff(ApplyFoodStuffModel applyFoodStuffModel, Subscriber<Object> subscriber) {
        applyUseClient.putApplyFoodStuff(applyId, applyFoodStuffModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改农补申请
     */
    public void putApplyFarmSubsidy(ApplyMachineModel applyMachineModel, Subscriber<Object> subscriber) {
        applyUseClient.putApplyFormSubsidy(applyId, applyMachineModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改肥宝宝申请(只能改保证金和委托)
     */
    public void putFertilizerData(MarginPayeeModel applyMaterialsModel, Subscriber<Object> subscriber) {
        applyUseClient.putMarginPayee(applyId, applyMaterialsModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 删除申请用途
     *
     * @param useId
     * @param subscriber
     */
    public void deleteApplyUse(String useId, Subscriber<Object> subscriber) {
        applyUseClient.deleteApplyUse(applyId, useId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
