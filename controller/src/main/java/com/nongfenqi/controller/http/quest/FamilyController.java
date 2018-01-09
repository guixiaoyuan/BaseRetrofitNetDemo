package com.nongfenqi.controller.http.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.client.quest.FamilyClient;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.family.FamilyAssetNavModel;
import com.nongfenqi.controller.model.family.FamilyAssetSummaryModel;
import com.nongfenqi.controller.model.family.FamilyCarModel;
import com.nongfenqi.controller.model.family.FamilyHouseModel;
import com.nongfenqi.controller.model.family.FamilyInfoModel;
import com.nongfenqi.controller.model.family.FamilyMemberModel;
import com.nongfenqi.controller.model.family.FamilyMemberPicModel;
import com.nongfenqi.controller.model.family.FamilyOtherModel;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.functions.Func3;
import rx.schedulers.Schedulers;

import static rx.Observable.zip;

/**
 * Function
 * 家庭信息接口
 *
 * @author jiezhi
 * @version 1.0, 18/10/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.0.0]
 */
public class FamilyController {

    private FamilyClient familyClient;
    private String applyId;

    public FamilyController(String applyId) {
        this.applyId = applyId;
        familyClient = ServiceGenerator.createService(FamilyClient.class);
    }

    /**
     * 获取家庭资产导航信息
     *
     * @param subscriber
     */
    public void getFamilyAssetNavInfo(Subscriber<FamilyAssetNavModel> subscriber) {
        familyClient.getFamilyAssetNav(applyId)
                .map(new ServiceGenerator.HttpResultFunc<FamilyAssetNavModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    /**
     * 获取所有的家庭资产信息
     *
     * @param subscriber
     */
    public void getFamilySummaryModel(Subscriber<FamilyAssetSummaryModel> subscriber) {
        //房产
        Observable<List<FamilyHouseModel>> familyHouseObservable = familyClient
                .getFamilyHouse(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<FamilyHouseModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
        //车辆
        Observable<List<FamilyCarModel>> familyCarObservable = familyClient
                .getFamilyCar(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<FamilyCarModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
        //其他
        Observable<List<FamilyOtherModel>> familyOtherObservable = familyClient
                .getFamilyOther(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<FamilyOtherModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        Observable<FamilyAssetSummaryModel> combined = zip(
                familyCarObservable,
                familyHouseObservable,
                familyOtherObservable,
                new Func3<List<FamilyCarModel>, List<FamilyHouseModel>, List<FamilyOtherModel>, FamilyAssetSummaryModel>() {
                    @Override
                    public FamilyAssetSummaryModel call(List<FamilyCarModel> familyCarModels, List<FamilyHouseModel> familyHouseModels, List<FamilyOtherModel> familyOtherModels) {
                        FamilyAssetSummaryModel familyAssetSummaryModel = new FamilyAssetSummaryModel();
                        familyAssetSummaryModel.setFamilyCarModelList(familyCarModels);
                        familyAssetSummaryModel.setFamilyHouseModelList(familyHouseModels);
                        familyAssetSummaryModel.setFamilyOtherModelList(familyOtherModels);
                        return familyAssetSummaryModel;
                    }
                });
        combined.subscribe(subscriber);
    }


    // family info
    public void getFamily(Subscriber<FamilyInfoModel> subscriber) {
        familyClient.getFamily(applyId)
                .map(new ServiceGenerator.HttpResultFunc<FamilyInfoModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    public void postFamily(FamilyInfoModel familyInfoModel, Subscriber<Integer> subscriber) {
        familyClient.postFamily(applyId, familyInfoModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    public void putFamily(FamilyInfoModel familyInfoModel, Subscriber<Integer> subscriber) {
        familyClient.putFamily(applyId, familyInfoModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取家庭房产信息
     *
     * @param subscriber
     */
    public void getFamilyHouse(Subscriber<List<FamilyHouseModel>> subscriber) {
        Observable<List<FamilyHouseModel>> familyVisitObservable = familyClient
                .getFamilyHouse(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<FamilyHouseModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        familyVisitObservable.subscribe(subscriber);
    }

    /**
     * 新增家庭房产
     *
     * @param model
     * @param subscriber
     */
    public void postFamilyHouse(FamilyHouseModel model, Subscriber<Integer> subscriber) {
        familyClient.postFamilyHouse(applyId, model)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改家庭房产
     *
     * @param model
     * @param subscriber
     */
    public void putFamilyHouse(FamilyHouseModel model, Subscriber<Integer> subscriber) {
        familyClient.putFamilyHouse(applyId, model)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除家庭房产
     *
     * @param assetId
     * @param subscriber
     */
    public void deleteFamilyHouse(int assetId, Subscriber<Integer> subscriber) {
        familyClient.deleteFamilyHouse(applyId, assetId)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取家庭车辆信息
     *
     * @param subscriber
     */
    public void getFamilyCar(Subscriber<List<FamilyCarModel>> subscriber) {
        Observable<List<FamilyCarModel>> familyCarObservable = familyClient
                .getFamilyCar(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<FamilyCarModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        familyCarObservable.subscribe(subscriber);
    }

    /**
     * 新增家庭车辆
     *
     * @param model
     * @param subscriber
     */
    public void postFamilyCar(FamilyCarModel model, Subscriber<Integer> subscriber) {
        familyClient.postFamilyCar(applyId, model)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改家庭车辆
     *
     * @param model
     * @param subscriber
     */
    public void putFamilyCar(FamilyCarModel model, Subscriber<Integer> subscriber) {
        familyClient.putFamilyCar(applyId, model)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除家庭车辆
     *
     * @param id
     * @param subscriber
     */
    public void deleteFamilyCar(int id, Subscriber<Integer> subscriber) {
        Observable<Integer> deleteFamilyCarObservable = familyClient
                .deleteFamilyCar(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        deleteFamilyCarObservable.subscribe(subscriber);
    }

    /**
     * 获取家庭其他
     *
     * @param subscriber
     */
    public void getFamilyOther(Subscriber<List<FamilyOtherModel>> subscriber) {
        familyClient.getFamilyOther(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<FamilyOtherModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 新增家庭其他
     *
     * @param model
     * @param subscriber
     */
    public void postFamilyOther(FamilyOtherModel model, Subscriber<Integer> subscriber) {
        familyClient.postFamilyOther(applyId, model)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改家庭其他
     *
     * @param model
     * @param subscriber
     */
    public void putFamilyOther(FamilyOtherModel model, Subscriber<Integer> subscriber) {
        familyClient.putFamilyOther(applyId, model)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除家庭其他
     *
     * @param id
     * @param subscriber
     */
    public void deleteFamilyOther(int id, Subscriber<Integer> subscriber) {
        familyClient.deleteFamilyOther(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 上传汽车图片
     *
     * @param carId
     * @param filePathList
     * @param subscriber
     */
    public void postFamilyCarPics(final String carId, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return familyClient.postFamilyCarPic(applyId, carId, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

    /**
     * 上传房产图片
     *
     * @param houseId
     * @param filePathList
     * @param subscriber
     */
    public void postFamilyHousePics(final String houseId, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return familyClient.postFamilyHousePic(applyId, houseId, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

    /**
     * 上传其他图片
     *
     * @param otherId
     * @param filePathList
     * @param subscriber
     */
    public void postFamilyOtherPics(final String otherId, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return familyClient.postFamilyOtherPic(applyId, otherId, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

    /**
     * 获取家庭成员图片组id
     *
     * @param subscriber
     */
    public void getFamilyMemberPicId(Subscriber<FamilyMemberPicModel> subscriber) {
        familyClient.getFamilyPicGroupId(applyId)
                .map(new ServiceGenerator.HttpResultFunc<FamilyMemberPicModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 上传家庭成员图片
     *
     * @param filePathList
     * @param stringSubscriber
     */
    public void postFamilyMemberPic(List<String> filePathList, Subscriber<String> stringSubscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String s) {
                return familyClient.postFamilyMemberPic(applyId, RetrofitTool.getMultipartBody(applyId, s, true));
            }
        }, stringSubscriber);
    }

    /**
     * 查询家庭成员信息
     *
     * @param subscriber
     */
    public void getFamilyMembers(Subscriber<List<FamilyMemberModel>> subscriber) {
        familyClient.getFamilyMember(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<FamilyMemberModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 新增家庭成员信息
     *
     * @param model
     * @param subscriber
     */
    public void postFamilyMember(FamilyMemberModel model, Subscriber<Integer> subscriber) {
        familyClient.postFamilyMember(applyId, model)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改家庭成员信息
     *
     * @param model
     * @param subscriber
     */
    public void putFamilyMember(FamilyMemberModel model, Subscriber<Integer> subscriber) {
        familyClient.putFamilyMember(applyId, model)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除家庭成员信息
     *
     * @param id
     * @param subscriber
     */
    public void deleteFamilyMember(int id, Subscriber<Integer> subscriber) {
        Observable<Integer> deleteFamilyCarObservable = familyClient
                .deleteFamilyMember(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        deleteFamilyCarObservable.subscribe(subscriber);
    }
}
