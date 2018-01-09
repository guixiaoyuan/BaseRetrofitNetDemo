package com.nongfenqi.controller.http.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.client.quest.ApplyBalanceClient;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.model.balance.ApplyAssetFixEstateModel;
import com.nongfenqi.controller.model.balance.ApplyAssetFixMachineModel;
import com.nongfenqi.controller.model.balance.ApplyAssetFixOtherModel;
import com.nongfenqi.controller.model.balance.ApplyAssetInventoryModel;
import com.nongfenqi.controller.model.balance.ApplyAssetMoneyModel;
import com.nongfenqi.controller.model.balance.ApplyAssetPrepaidRentModel;
import com.nongfenqi.controller.model.balance.ApplyAssetPrepaymentModel;
import com.nongfenqi.controller.model.balance.ApplyAssetReceivableModel;
import com.nongfenqi.controller.model.balance.ApplyBalanceAccountReceivableModel;
import com.nongfenqi.controller.model.balance.ApplyBalanceAmountModel;
import com.nongfenqi.controller.model.balance.ApplyBalanceAssetFixModel;
import com.nongfenqi.controller.model.balance.ApplyBalanceModel;
import com.nongfenqi.controller.model.balance.ApplyNavBalanceModel;
import com.nongfenqi.controller.model.balance.ApplySheetModel;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;


/**
 * 资产负债信息
 *
 * @author jiezhi
 * @version 1.0, 14/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class ApplyBalanceController {
    private static final String TAG = ApplyBalanceController.class.getSimpleName();

    private String applyId;
    private ApplyBalanceClient applyBalanceClient;

    public ApplyBalanceController(String applyId) {
        this.applyId = applyId;
        applyBalanceClient = ServiceGenerator.createService(ApplyBalanceClient.class);
    }

    /**
     * 查询资产负债导航
     *
     * @param subscriber
     */
    public void getNavBalance(Subscriber<ApplyNavBalanceModel> subscriber) {
        applyBalanceClient.getNavBalance(applyId)
                .map(new ServiceGenerator.HttpResultFunc<ApplyNavBalanceModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 查询资产负债
     *
     * @param subscriber
     */
    public void getBalance(Subscriber<ApplyBalanceModel> subscriber) {
        applyBalanceClient.getBalance(applyId)
                .map(new ServiceGenerator.HttpResultFunc<ApplyBalanceModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 创建资产负债
     *
     * @param applyBalanceModel
     * @param subscriber
     */
    public void postBalance(ApplyBalanceModel applyBalanceModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postBalance(applyId, applyBalanceModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //

    /**
     * 修改资产负债
     *
     * @param applyBalanceModel
     * @param subscriber
     */
    public void putBalance(ApplyBalanceModel applyBalanceModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putBalance(applyId, applyBalanceModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 查询资产/负债的总金额
     *
     * @param subscriber
     */
    public void getBalanceAmount(Subscriber<ApplyBalanceAmountModel> subscriber) {
        applyBalanceClient.getBalanceAmount(applyId)
                .map(new ServiceGenerator.HttpResultFunc<ApplyBalanceAmountModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 查询固定性资产
     *
     * @param subscriber
     */
    public void getBalanceAssetFix(Subscriber<ApplyBalanceAssetFixModel> subscriber) {
        applyBalanceClient.getBalanceAssetFix(applyId)
                .map(new ServiceGenerator.HttpResultFunc<ApplyBalanceAssetFixModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /*--------------------------------固定资产-库房厂房-------------------------------------------*/

    /**
     * 新增固定资产-库房厂房
     *
     * @param applyAssetFixEstateModel
     * @param subscriber
     */
    public void postAssetFixEstate(ApplyAssetFixEstateModel applyAssetFixEstateModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postAssetFixEstate(applyId, applyAssetFixEstateModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改固定资产-库房厂房
     *
     * @param applyAssetFixEstateModel
     * @param subscriber
     */
    public void putAssetFixEstate(ApplyAssetFixEstateModel applyAssetFixEstateModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putAssetFixEstate(applyId, applyAssetFixEstateModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 上传资产信息（固定资产-库房厂房）图片
     *
     * @param id
     * @param filePathList
     * @param subscriber
     */
    public void uploadAssetFixEstatePicById(final int id, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return applyBalanceClient.uploadAssetFixEstatePicById(applyId, id, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }


    /**
     * 删除固定资产-库房厂房
     *
     * @param id
     * @param subscriber
     */
    public void deleteAssetFixEstateById(int id, Subscriber<Object> subscriber) {
        applyBalanceClient.deleteAssetFixEstateById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /*--------------------------------固定资产-农机设备-------------------------------------------*/

    /**
     * 新增固定性资产-农机设备
     *
     * @param applyAssetFixMachineModel
     * @param subscriber
     */
    public void postAssetFixMachine(ApplyAssetFixMachineModel applyAssetFixMachineModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postAssetFixMachine(applyId, applyAssetFixMachineModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改固定资产-农机设备
     *
     * @param applyAssetFixMachineModel
     * @param subscriber
     */
    public void putAssetFixMachine(ApplyAssetFixMachineModel applyAssetFixMachineModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putAssetFixMachine(applyId, applyAssetFixMachineModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 上传资产信息（固定资产-农机）图片
     *
     * @param id
     * @param filePathList
     * @param subscriber
     */
    public void uploadAssetFixMachinePicById(final int id, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return applyBalanceClient.uploadAssetFixMachinePicById(applyId, id, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }


    /**
     * 删除固定资产-农机设备
     *
     * @param id
     * @param subscriber
     */
    public void deleteAssetFixMachineById(int id, Subscriber<Object> subscriber) {
        applyBalanceClient.deleteAssetFixMachineById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /*--------------------------------固定资产-其他-------------------------------------------*/

    /**
     * 新增固定资产-其他
     *
     * @param applyAssetFixOtherModel
     * @param subscriber
     */
    public void postAssetFixOther(ApplyAssetFixOtherModel applyAssetFixOtherModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postAssetFixOther(applyId, applyAssetFixOtherModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改固定资产-其他
     *
     * @param applyAssetFixOtherModel
     * @param subscriber
     */
    public void putAssetFixOther(ApplyAssetFixOtherModel applyAssetFixOtherModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putAssetFixOther(applyId, applyAssetFixOtherModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 上传资产信息（固定资产-其他）图片
     *
     * @param id
     * @param filePathList
     * @param subscriber
     */
    public void uploadAssetFixOtherPicById(final int id, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return applyBalanceClient.uploadAssetFixOtherPicById(applyId, id, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }


    /**
     * 删除固定资产-其他
     *
     * @param id
     * @param subscriber
     */
    public void deleteAssetFixOtherById(int id, Subscriber<Object> subscriber) {
        applyBalanceClient.deleteAssetFixOtherById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /*--------------------------------存货-------------------------------------------*/

    /**
     * 查询存货
     *
     * @param subscriber
     */
    public void getAssetInventory(Subscriber<List<ApplyAssetInventoryModel>> subscriber) {
        applyBalanceClient.getAssetInventory(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<ApplyAssetInventoryModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 新增存货
     *
     * @param applyAssetInventoryModel
     * @param subscriber
     */
    public void postAssetInventory(ApplyAssetInventoryModel applyAssetInventoryModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postAssetInventory(applyId, applyAssetInventoryModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改存货
     *
     * @param applyAssetInventoryModel
     * @param subscriber
     */
    public void putAssetInventory(ApplyAssetInventoryModel applyAssetInventoryModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putAssetInventory(applyId, applyAssetInventoryModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 上传资产信息（存货）图片
     *
     * @param id
     * @param filePathList
     * @param subscriber
     */
    public void uploadAssetInventoryPicById(final int id, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return applyBalanceClient.uploadAssetInventoryPicById(applyId, id, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }


    /**
     * 删除存货
     *
     * @param id
     * @param subscriber
     */
    public void deleteAssetInventoryById(int id, Subscriber<Object> subscriber) {
        applyBalanceClient.deleteAssetInventoryById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /*--------------------------------资产信息(现金、银行存款)-------------------------------------------*/

    /**
     * 查询资产信息(现金、银行存款)
     *
     * @param subscriber
     */
    public void getAssetMoney(Subscriber<List<ApplyAssetMoneyModel>> subscriber) {
        applyBalanceClient.getAssetMoney(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<ApplyAssetMoneyModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 新增资产信息(现金、银行存款)
     *
     * @param applyAssetMoneyModel
     * @param subscriber
     */
    public void postAssetMoney(ApplyAssetMoneyModel applyAssetMoneyModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postAssetMoney(applyId, applyAssetMoneyModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改资产信息(现金、银行存款)
     *
     * @param applyAssetMoneyModel
     * @param subscriber
     */
    public void putAssetMoney(ApplyAssetMoneyModel applyAssetMoneyModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putAssetMoney(applyId, applyAssetMoneyModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 删除资产信息(现金、银行存款)
     *
     * @param id
     * @param subscriber
     */
    public void deleteAssetMoneyById(int id, Subscriber<Object> subscriber) {
        applyBalanceClient.deleteAssetMoneyById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 上传资产信息(现金、银行存款)图片
     *
     * @param id
     * @param filePathList
     * @param subscriber
     */
    public void uploadAssetMoneyPicById(final int id, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return applyBalanceClient.uploadAssetMoneyPicById(applyId, id, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

    /*--------------------------------外摊租金-------------------------------------------*/

    /**
     * 查询外摊租金
     *
     * @param subscriber
     */
    public void getAssetPrepaidRent(Subscriber<List<ApplyAssetPrepaidRentModel>> subscriber) {
        applyBalanceClient.getAssetPrepaidRent(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<ApplyAssetPrepaidRentModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 新增修改外摊租金
     *
     * @param applyAssetPrepaidRentModel
     * @param subscriber
     */
    public void postAssetPrepaidRent(ApplyAssetPrepaidRentModel applyAssetPrepaidRentModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postAssetPrepaidRent(applyId, applyAssetPrepaidRentModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改外摊租金
     *
     * @param applyAssetPrepaidRentModel
     * @param subscriber
     */
    public void putAssetPrepaidRent(ApplyAssetPrepaidRentModel applyAssetPrepaidRentModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putAssetPrepaidRent(applyId, applyAssetPrepaidRentModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //

    /**
     * 删除外摊租金
     *
     * @param id
     * @param subscriber
     */
    public void deleteAssetPrepaidRentById(int id, Subscriber<Object> subscriber) {
        applyBalanceClient.deleteAssetPrepaidRentById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 上传外摊租金图片
     *
     * @param id
     * @param filePathList
     * @param subscriber
     */
    public void uploadAssetPrepaidRentPicById(final int id, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return applyBalanceClient.uploadAssetPrepaidRentPicById(applyId, id, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

    /*--------------------------------预付款项-------------------------------------------*/

    /**
     * 查询预付款项
     *
     * @param subscriber
     */
    public void getAssetPrepayment(Subscriber<List<ApplyAssetPrepaymentModel>> subscriber) {
        applyBalanceClient.getAssetPrepayment(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<ApplyAssetPrepaymentModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 新增预付款项
     *
     * @param applyAssetPrepaymentModel
     * @param subscriber
     */
    public void postAssetPrepayment(ApplyAssetPrepaymentModel applyAssetPrepaymentModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postAssetPrepayment(applyId, applyAssetPrepaymentModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改预付款项
     *
     * @param applyAssetPrepaymentModel
     * @param subscriber
     */
    public void putAssetPrepayment(ApplyAssetPrepaymentModel applyAssetPrepaymentModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putAssetPrepayment(applyId, applyAssetPrepaymentModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 删除预付款项
     *
     * @param id
     * @param subscriber
     */
    public void deleteAssetPrepaymentById(int id, Subscriber<Object> subscriber) {
        applyBalanceClient.deleteAssetPrepaymentById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 上传预付款项图片
     *
     * @param id
     * @param filePathList
     * @param subscriber
     */
    public void uploadAssetPrepaymentPicById(final int id, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return applyBalanceClient.uploadAssetPrepaymentPicById(applyId, id, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

     /*--------------------------------应收账款-------------------------------------------*/

    /**
     * 查询应收账款
     *
     * @param subscriber
     */
    public void getAssetReceivable(Subscriber<List<ApplyAssetReceivableModel>> subscriber) {
        applyBalanceClient.getAssetReceivable(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<ApplyAssetReceivableModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 新增应收账款
     *
     * @param applyAssetReceivableModel
     * @param subscriber
     */
    public void postAssetReceivable(ApplyAssetReceivableModel applyAssetReceivableModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postAssetReceivable(applyId, applyAssetReceivableModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改应收账款
     *
     * @param applyAssetReceivableModel
     * @param subscriber
     */
    public void putAssetReceivable(ApplyAssetReceivableModel applyAssetReceivableModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putAssetReceivable(applyId, applyAssetReceivableModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 删除应收账款
     *
     * @param id
     * @param subscriber
     */
    public void deleteAssetReceivableById(int id, Subscriber<Object> subscriber) {
        applyBalanceClient.deleteAssetReceivableById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 上传应收账款片
     *
     * @param id
     * @param filePathList
     * @param subscriber
     */
    public void uploadAssetReceivablePicById(final int id, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return applyBalanceClient.uploadAssetReceivablePicById(applyId, id, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

         /*--------------------------------表外项目-------------------------------------------*/

    /**
     * 查询表外项目
     *
     * @param subscriber
     */
    public void getSheetItems(Subscriber<List<ApplySheetModel>> subscriber) {
        applyBalanceClient.getSheetItems(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<ApplySheetModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 新增表外项目
     *
     * @param applySheetModel
     * @param subscriber
     */
    public void postSheetItem(ApplySheetModel applySheetModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postSheetItem(applyId, applySheetModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改表外项目
     *
     * @param applySheetModel
     * @param subscriber
     */
    public void putSheetItem(ApplySheetModel applySheetModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putSheetItem(applyId, applySheetModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 删除表外项目
     *
     * @param id
     * @param subscriber
     */
    public void deleteSheetItemById(int id, Subscriber<Object> subscriber) {
        applyBalanceClient.deleteSheetItemById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /*--------------------------------负债-------------------------------------------*/

    /**
     * 查询负债信息(应付账款、预收款项、短期贷款、其他负债
     *
     * @param subscriber
     */
    public void getAccountReceivable(Subscriber<List<ApplyBalanceAccountReceivableModel>> subscriber) {
        applyBalanceClient.getAccountReceivable(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<ApplyBalanceAccountReceivableModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建负债信息(应付账款、预收款项、短期贷款、其他负债)
     *
     * @param applyAssetReceivableModel
     * @param subscriber
     */
    public void postAccountReceivable(ApplyBalanceAccountReceivableModel applyAssetReceivableModel, Subscriber<Integer> subscriber) {
        applyBalanceClient.postAccountReceivable(applyId, applyAssetReceivableModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改负债信息(应付账款、预收款项、短期贷款、其他负债)
     *
     * @param applyAssetReceivableModel
     * @param subscriber
     */
    public void putAccountReceivable(ApplyBalanceAccountReceivableModel applyAssetReceivableModel, Subscriber<Object> subscriber) {
        applyBalanceClient.putAccountReceivable(applyId, applyAssetReceivableModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 删除应收账款
     *
     * @param id
     * @param subscriber
     */
    public void deleteAccountReceivableById(int id, Subscriber<Object> subscriber) {
        applyBalanceClient.deleteAccountReceivableById(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
