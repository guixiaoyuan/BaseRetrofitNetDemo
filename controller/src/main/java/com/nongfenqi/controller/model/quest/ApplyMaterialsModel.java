package com.nongfenqi.controller.model.quest;

import com.nongfenqi.controller.model.CluePool.CluePoolItemDetailModel;
import com.nongfenqi.controller.model.common.StateModel;

import java.util.List;

/**
 * 肥宝宝分期 模版
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/10/19
 * @since [sherlock/V2.2.5]
 */
public class ApplyMaterialsModel {

    private StateModel accountType;//账号类型 0 对私; 1 对公 ,
    private List<CluePoolItemDetailModel.MaterialsInfo> agrMaterialsGoods;//商品列表
    private float applyAmount;
    private String customerId;
    private String description;
    private float downPayment;
    private float marginAmount;
    private boolean marginState;
    private StateModel payeeType;
    private float price;
    private StateModel saleType;//销售类型(现货,预售) ,
    private String useId;
    private StateModel useType;

    private String dealerName;
    private float tonnage;
    private String materialsCode;

    public ApplyMaterialsModel(Builder builder) {
        setAccountType(builder.accountType);
        setAgrMaterialsGoods(builder.agrMaterialsGoods);
        setApplyAmount(builder.applyAmount);
        setCustomerId(builder.customerId);
        setDescription(builder.description);
        setDownPayment(builder.downPayment);
        setMarginAmount(builder.marginAmount);
        setMarginState(builder.marginState);
        setPayeeType(builder.payeeType);
        setPrice(builder.price);
        setSaleType(builder.saleType);
        setUseId(builder.useId);
        setUseType(builder.useType);
    }


    public StateModel getAccountType() {
        return accountType;
    }

    public void setAccountType(StateModel accountType) {
        this.accountType = accountType;
    }

    public List<CluePoolItemDetailModel.MaterialsInfo> getAgrMaterialsGoods() {
        return agrMaterialsGoods;
    }

    public void setAgrMaterialsGoods(List<CluePoolItemDetailModel.MaterialsInfo> agrMaterialsGoods) {
        this.agrMaterialsGoods = agrMaterialsGoods;
    }

    public float getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(float applyAmount) {
        this.applyAmount = applyAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(float downPayment) {
        this.downPayment = downPayment;
    }

    public float getMarginAmount() {
        return marginAmount;
    }

    public void setMarginAmount(float marginAmount) {
        this.marginAmount = marginAmount;
    }

    public boolean isMarginState() {
        return marginState;
    }

    public void setMarginState(boolean marginState) {
        this.marginState = marginState;
    }

    public StateModel getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(StateModel payeeType) {
        this.payeeType = payeeType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public StateModel getSaleType() {
        return saleType;
    }

    public void setSaleType(StateModel saleType) {
        this.saleType = saleType;
    }

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId;
    }

    public StateModel getUseType() {
        return useType;
    }

    public void setUseType(StateModel useType) {
        this.useType = useType;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public float getTonnage() {
        return tonnage;
    }

    public void setTonnage(float tonnage) {
        this.tonnage = tonnage;
    }

    public String getMaterialsCode() {
        return materialsCode;
    }

    public void setMaterialsCode(String materialsCode) {
        this.materialsCode = materialsCode;
    }

    public static class Builder {
        private StateModel accountType;//账号类型 0 对私; 1 对公 ,
        private List<CluePoolItemDetailModel.MaterialsInfo> agrMaterialsGoods;//商品列表
        private float applyAmount;
        private String customerId;
        private String description;
        private float downPayment;
        private float marginAmount;
        private boolean marginState;
        private StateModel payeeType;
        private float price;
        private StateModel saleType;//销售类型(现货,预售) ,
        private String useId;
        private StateModel useType;

        public Builder withAccounType(StateModel val) {
            accountType = val;
            return this;
        }

        public Builder withMaterialGoods(List<CluePoolItemDetailModel.MaterialsInfo> val) {
            agrMaterialsGoods = val;
            return this;
        }

        public Builder withApplyAmount(float val) {
            applyAmount = val;
            return this;
        }

        public Builder withCustomerId(String val) {
            customerId = val;
            return this;
        }

        public Builder withDescription(String val) {
            description = val;
            return this;
        }

        public Builder withDownPayment(float val) {
            downPayment = val;
            return this;
        }

        public Builder withMarginAmount(float val) {
            marginAmount = val;
            return this;
        }

        public Builder withMarginState(boolean val) {
            marginState = val;
            return this;
        }

        public Builder withPrice(float val) {
            price = val;
            return this;
        }

        public Builder withUseId(String val) {
            useId = val;
            return this;
        }

        public Builder withPayteeType(StateModel val) {
            payeeType = val;
            return this;
        }

        public Builder withUseType(StateModel val) {
            useType = val;
            return this;
        }

        public Builder withSaleType(StateModel val) {
            saleType = val;
            return this;
        }

        public ApplyMaterialsModel builder() {
            return new ApplyMaterialsModel(this);
        }

    }

}
