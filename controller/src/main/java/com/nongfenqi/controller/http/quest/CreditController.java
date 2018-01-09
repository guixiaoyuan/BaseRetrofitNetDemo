package com.nongfenqi.controller.http.quest;


import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.client.quest.CoborrowerClient;
import com.nongfenqi.controller.client.quest.CreditClient;
import com.nongfenqi.controller.client.quest.CustomerClient;
import com.nongfenqi.controller.client.quest.GuarantorClient;
import com.nongfenqi.controller.configure.RetrofitTool;
import com.nongfenqi.controller.configure.ServiceGenerator;
import com.nongfenqi.controller.configure.UrlConstant;
import com.nongfenqi.controller.model.coborrower.CoborrowerInfoModel;
import com.nongfenqi.controller.model.credit.CreditAllLoanGuaranteeModel;
import com.nongfenqi.controller.model.credit.CreditAllMemberModel;
import com.nongfenqi.controller.model.credit.CreditCourtInfoModel;
import com.nongfenqi.controller.model.credit.CreditExplanationModel;
import com.nongfenqi.controller.model.credit.CreditLoanBalanceModel;
import com.nongfenqi.controller.model.credit.CreditNavInfoModel;
import com.nongfenqi.controller.model.credit.CreditPbcModel;
import com.nongfenqi.controller.model.credit.CreditPbcRecordModel;
import com.nongfenqi.controller.model.credit.CreditPbcRecordSummaryModel;
import com.nongfenqi.controller.model.credit.CreditRiskReportModel;
import com.nongfenqi.controller.model.credit.ReportInfoModel;
import com.nongfenqi.controller.model.customer.CustomerInfoModel;
import com.nongfenqi.controller.model.guarantor.GuarantorModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.schedulers.Schedulers;

import static rx.Observable.zip;


/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 16/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class CreditController {
    private static final String APPLY_ID = "applyId";
    private static final String TYPE = "type";
    public static final String TYPE_LOAN = "1";
    public static final String TYPE_GUARANTEE = "2";
    private static final String CARD_ID = "cardId";
    public static final int PERSONAL_TYPE = 1;//汇法网个人查询类型
    public static final int BUSINESS_TYPE = 2;//会汇法网企业查询类型
    private String applyId;

    private CreditClient creditClient;

    public CreditController(String applyId) {
        this.applyId = applyId;
        creditClient = ServiceGenerator.createService(CreditClient.class);
    }

    /**
     * 查询客户/担保人／共借人本公司贷款／担保历史情况（新)
     *
     * @param cardId
     * @param subscriber
     */
    public void getCustomerCoBorrowerAndGuarantor(String cardId, Subscriber<Map<String, List<CreditAllLoanGuaranteeModel>>> subscriber) {

        //本公司借款
        Map<String, String> loanOptions = new HashMap<>();
        loanOptions.put(TYPE, TYPE_LOAN);
        loanOptions.put(CARD_ID, cardId);
        Observable<List<CreditAllLoanGuaranteeModel>> getLoanRecordSum =
                creditClient.getCusGuaAndCoBorrower(applyId, loanOptions).
                        map(new ServiceGenerator.HttpResultFunc<List<CreditAllLoanGuaranteeModel>>())
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread());

        //本公司担保
        Map<String, String> guaranteeOptions = new HashMap<>();
        guaranteeOptions.put(TYPE, TYPE_GUARANTEE);
        guaranteeOptions.put(CARD_ID, cardId);
        Observable<List<CreditAllLoanGuaranteeModel>> getGuaranteeRecordSummary =
                creditClient.getCusGuaAndCoBorrower(applyId, guaranteeOptions).
                        map(new ServiceGenerator.HttpResultFunc<List<CreditAllLoanGuaranteeModel>>())
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread());

        Observable.zip(getLoanRecordSum, getGuaranteeRecordSummary,
                new Func2<List<CreditAllLoanGuaranteeModel>, List<CreditAllLoanGuaranteeModel>, Map<String, List<CreditAllLoanGuaranteeModel>>>() {
                    @Override
                    public Map<String, List<CreditAllLoanGuaranteeModel>> call(List<CreditAllLoanGuaranteeModel> creditAllLoanGuaranteeModels,
                                                                               List<CreditAllLoanGuaranteeModel> creditAllLoanGuaranteeModels2) {
                        Map<String, List<CreditAllLoanGuaranteeModel>> map = new HashMap<>();
                        map.put(TYPE_LOAN, creditAllLoanGuaranteeModels);
                        map.put(TYPE_GUARANTEE, creditAllLoanGuaranteeModels2);
                        return map;
                    }
                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    /**
     * 查询客户央行征信详情
     *
     * @param personId subscriber
     */
    public void getCreditPbcSummary(String personId, Subscriber<Map<String, CreditPbcRecordSummaryModel>> subscriber) {
        Map<String, String> loanOptions = new HashMap<>();
        loanOptions.put(APPLY_ID, applyId);
        loanOptions.put(TYPE, TYPE_LOAN);
        loanOptions.put("startIndex", "0");
        loanOptions.put("pageSize", "1000");
        loanOptions.put("personId", personId);
        Observable<CreditPbcRecordSummaryModel> getLoanRecordSummary =
                creditClient.getCreditPbcSummary(loanOptions)
                        .map(new ServiceGenerator.HttpResultFunc<CreditPbcRecordSummaryModel>())
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread());

        Map<String, String> guaranteeOptions = new HashMap<>();
        guaranteeOptions.put(APPLY_ID, applyId);
        guaranteeOptions.put(TYPE, TYPE_GUARANTEE);
        guaranteeOptions.put("startIndex", "0");
        guaranteeOptions.put("pageSize", "1000");
        guaranteeOptions.put("personId", personId);
        Observable<CreditPbcRecordSummaryModel> getGuaranteeRecordSummary =
                creditClient.getCreditPbcSummary(guaranteeOptions)
                        .map(new ServiceGenerator.HttpResultFunc<CreditPbcRecordSummaryModel>())
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread());

        Observable.zip(getLoanRecordSummary, getGuaranteeRecordSummary,
                new Func2<CreditPbcRecordSummaryModel, CreditPbcRecordSummaryModel, Map<String, CreditPbcRecordSummaryModel>>() {
                    @Override
                    public Map<String, CreditPbcRecordSummaryModel> call(CreditPbcRecordSummaryModel creditPbcRecordSummaryModel, CreditPbcRecordSummaryModel creditPbcRecordSummaryModel2) {
                        Map<String, CreditPbcRecordSummaryModel> map = new HashMap<>();
                        map.put(TYPE_LOAN, creditPbcRecordSummaryModel);
                        map.put(TYPE_GUARANTEE, creditPbcRecordSummaryModel2);
                        return map;
                    }
                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取信用报告导航信息
     *
     * @param subscriber
     */
    public void getCreditNavInfo(Subscriber<List<CreditNavInfoModel>> subscriber) {
        creditClient.getCreditNavInfo(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<CreditNavInfoModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取客户，共借人和担保人的人员信息
     *
     * @param subscriber
     */
    public void getAllCreditMembers(Subscriber<CreditAllMemberModel> subscriber) {
        //客户本人信息
        Observable<CustomerInfoModel> customerModelObservable = ServiceGenerator.createService(CustomerClient.class)
                .getCustomerInfo(applyId)
                .map(new ServiceGenerator.HttpResultFunc<CustomerInfoModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
        //共借人
        Observable<List<CoborrowerInfoModel>> coBorrowerObservable = ServiceGenerator.createService(CoborrowerClient.class)
                .getCoborrowerInfo(applyId)
                .map(new ServiceGenerator.HttpResultFunc<List<CoborrowerInfoModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
        //担保人
        Observable<List<GuarantorModel>> guarantorObservable = ServiceGenerator.createService(GuarantorClient.class)
                .getGuarantorList(applyId).map(new ServiceGenerator.HttpResultFunc<List<GuarantorModel>>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
        Observable<CreditAllMemberModel> combined = zip(
                customerModelObservable,
                coBorrowerObservable,
                guarantorObservable,
                new Func3<CustomerInfoModel, List<CoborrowerInfoModel>, List<GuarantorModel>, CreditAllMemberModel>() {
                    @Override
                    public CreditAllMemberModel call(CustomerInfoModel questCustomerModel, List<CoborrowerInfoModel> coborrowerInfoModels, List<GuarantorModel> guarantorModels) {
                        CreditAllMemberModel allMemberModel = new CreditAllMemberModel();
                        allMemberModel.setQuestCustomerModel(questCustomerModel);
                        allMemberModel.setCoBorrowerModels(coborrowerInfoModels);
                        allMemberModel.setGuarantorModels(guarantorModels);
                        return allMemberModel;
                    }
                }
        );
        combined.subscribe(subscriber);
    }

    //--------------------信用历史---------------------

    /**
     * 查询信用历史说明
     *
     * @param subscriber
     */
    public void getCreditExplanation(String personId, Subscriber<CreditExplanationModel> subscriber) {
        creditClient.getCreditExplanation(applyId, personId)
                .map(new ServiceGenerator.HttpResultFunc<CreditExplanationModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 新增信用历史说明
     *
     * @param creditExplanationModel
     * @param subscriber
     */
    public void postCreditExplanation(CreditExplanationModel creditExplanationModel, Subscriber<Integer> subscriber) {
        creditClient.postCreditExplanation(applyId, creditExplanationModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 编辑信用历史说明
     *
     * @param creditExplanationModel
     * @param subscriber
     */
    public void putCreditExplanation(CreditExplanationModel creditExplanationModel, Subscriber<Object> subscriber) {
        creditClient.putCreditExplanation(applyId, creditExplanationModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除信用历史说明
     *
     * @param explanationId
     * @param subscriber
     */
    public void deleteCreditExplanation(int explanationId, Subscriber<Object> subscriber) {
        creditClient.deleteCreditExplanation(applyId, explanationId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //--------------------央行征信账户---------------------

    /**
     * 查询客户央行征信账户
     *
     * @param personId
     * @param subscriber
     */
    public void getCreditPbc(String personId, Subscriber<CreditPbcModel> subscriber) {
        creditClient.getCreditPbc(applyId, personId)
                .map(new ServiceGenerator.HttpResultFunc<CreditPbcModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 添加客户央行征信账户
     *
     * @param creditPbcModel
     * @param subscriber
     */
    public void postCreditPbc(CreditPbcModel creditPbcModel, Subscriber<Integer> subscriber) {
        creditClient.postCreditPbc(applyId, creditPbcModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改客户央行征信账户
     *
     * @param creditPbcModel
     * @param subscriber
     */
    public void putCreditPbc(CreditPbcModel creditPbcModel, Subscriber<Object> subscriber) {
        creditClient.putCreditPbc(applyId, creditPbcModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //--------------------央行征信详情---------------------

    /**
     * 查询单个客户央行征信详情
     *
     * @param subscriber
     */
    public void getCreditPbcRecord(int id, Subscriber<CreditPbcRecordModel> subscriber) {
        creditClient.getCreditPbcRecord(applyId, id)
                .map(new ServiceGenerator.HttpResultFunc<CreditPbcRecordModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 添加客户央行征信详情
     *
     * @param creditPbcRecordModel
     * @param subscriber
     */
    public void postCreditPbcRecord(CreditPbcRecordModel creditPbcRecordModel, Subscriber<Integer> subscriber) {
        creditClient.postCreditPbcRecord(applyId, creditPbcRecordModel)
                .map(new ServiceGenerator.HttpResultFunc<Integer>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 修改客户央行征信详情
     *
     * @param creditPbcRecordModel
     * @param subscriber
     */
    public void putCreditPbcRecord(CreditPbcRecordModel creditPbcRecordModel, Subscriber<Object> subscriber) {
        creditClient.putCreditPbcRecord(applyId, creditPbcRecordModel)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除客户央行征信详情
     *
     * @param explanationId
     * @param subscriber
     */
    public void deleteCreditPbcRecord(int explanationId, Subscriber<Object> subscriber) {
        creditClient.deleteCreditPbcRecord(applyId, explanationId)
                .map(new ServiceGenerator.HttpResultFunc<>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //查询客户本公司贷款记录

    /**
     * 查询客户本公司贷款记录
     *
     * @param subscriber
     */
    public void getCreditLoanBalance(String cardId, Subscriber<CreditLoanBalanceModel> subscriber) {
        creditClient.getCreditLoanBalance(applyId, cardId)
                .map(new ServiceGenerator.HttpResultFunc<CreditLoanBalanceModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


//    /**
//     * 查询客户本公司贷款/担保历史情况
//     *
//     * @param subscriber
//     */
//    public void getCreditLoanGuarantee(int type, Subscriber<List<CreditLoanGuaranteeModel>> subscriber) {
//        creditClient.getCreditLoanGuarantee(applyId, type)
//                .map(new ServiceGenerator.HttpResultFunc<List<CreditLoanGuaranteeModel>>())
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(subscriber);
//    }

    /**
     * 上传信用历史图片
     *
     * @param filePathList
     * @param subscriber
     */
    public void uploadCreditImages(final String personId, List<String> filePathList, Subscriber<String> subscriber) {
        RetrofitTool.uploadImages(filePathList, new Func1<String, Observable<BaseResponse<String>>>() {
            @Override
            public Observable<BaseResponse<String>> call(String filePath) {
                return creditClient.postCreditPic(applyId, personId, RetrofitTool.getMultipartBody(applyId, filePath, true));
            }
        }, subscriber);
    }

    /**
     * 根据申请编号查询风控报告
     *
     * @param cardId
     * @param subscriber
     */
    public static void getRiskReport(String cardId, Subscriber<CreditRiskReportModel> subscriber) {
        CreditClient creditClient = ServiceGenerator.createService(CreditClient.class, UrlConstant.SERVER_GALEN_BASE_URL);
        creditClient.getRiskReport(cardId)
                .map(new ServiceGenerator.HttpResultFunc<CreditRiskReportModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 查询汇法网执行信息
     *
     * @param cardId
     * @param name
     * @param subscriber
     */
    public static void getCourtReport(String cardId, String name, int type, Subscriber<CreditCourtInfoModel> subscriber) {
        CreditClient creditClient = ServiceGenerator.createService(CreditClient.class, UrlConstant.SERVER_GALEN_BASE_URL);
        creditClient.getLawCourtReport(cardId, name, type)
                .map(new ServiceGenerator.HttpResultFunc<CreditCourtInfoModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建申请报告
     *
     * @param reportInfoModel
     * @param subscriber
     */
    public static void postReportInfo(ReportInfoModel reportInfoModel, Subscriber<ReportInfoModel> subscriber) {
        CreditClient creditClient = ServiceGenerator.createService(CreditClient.class, UrlConstant.SERVER_GALEN_BASE_URL);
        creditClient.postReportInfo(reportInfoModel)
                .map(new ServiceGenerator.HttpResultFunc<ReportInfoModel>())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
