package com.nongfenqi.controller.model.balance;

/**
 * Function
 * 现金、银行存款
 *
 * @author jiezhi
 * @version 1.0, 15/02/2017
 * @see [相关类/方法]
 * @since [农人帮/V1.1.2]
 */
public class ApplyAssetMoneyModel {
    private static final String TAG = ApplyAssetMoneyModel.class.getSimpleName();


    /**
     * amount : 20000
     * assetType : {"id":0,"name":"string"}
     * id : 1
     * picGroupId : 0123
     */

    private float amount;
    private AssetTypeEntity assetType;
    private int id;
    private String picGroupId;

    private ApplyAssetMoneyModel(Builder builder) {
        setAmount(builder.amount);
        setAssetType(builder.assetType);
        setId(builder.id);
        setPicGroupId(builder.picGroupId);
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public AssetTypeEntity getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetTypeEntity assetType) {
        this.assetType = assetType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(String picGroupId) {
        this.picGroupId = picGroupId;
    }

    public static class AssetTypeEntity {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static final class Builder {
        private float amount;
        private AssetTypeEntity assetType;
        private int id;
        private String picGroupId;

        public Builder() {
        }

        public Builder withAmount(float val) {
            amount = val;
            return this;
        }

        public Builder withAssetType(AssetTypeEntity val) {
            assetType = val;
            return this;
        }

        public Builder withId(int val) {
            id = val;
            return this;
        }

        public Builder withPicGroupId(String val) {
            picGroupId = val;
            return this;
        }

        public ApplyAssetMoneyModel build() {
            return new ApplyAssetMoneyModel(this);
        }
    }
}
