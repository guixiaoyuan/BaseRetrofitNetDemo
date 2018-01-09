package com.nongfenqi.controller.model.guarantor;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * 担保人资产
 *
 * @author yuanfei
 * @version 1.0, 2017/4/14
 * @since [sherlock/V1.0.0]
 */

public class GuarantorAssertModel implements Serializable, Parcelable {

    /**
     * assetExplain : 说明一下情况
     * assetType : {"id":0,"name":"string"}
     * id : 1
     * isCheck : false
     */

    private String assetExplain;
    private AssetTypeBean assetType;
    private int id;
    private boolean isCheck;

    public GuarantorAssertModel() {
    }

    protected GuarantorAssertModel(Parcel in) {
        assetExplain = in.readString();
        id = in.readInt();
        isCheck = in.readByte() != 0;
        assetType = new AssetTypeBean(in);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(assetExplain);
        dest.writeInt(id);
        dest.writeByte((byte) (isCheck ? 1 : 0));
        assetType.writeToParcel(dest, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<GuarantorAssertModel> CREATOR = new Creator<GuarantorAssertModel>() {
        @Override
        public GuarantorAssertModel createFromParcel(Parcel in) {
            return new GuarantorAssertModel(in);
        }

        @Override
        public GuarantorAssertModel[] newArray(int size) {
            return new GuarantorAssertModel[size];
        }
    };

    public String getAssetExplain() {
        return assetExplain;
    }

    public void setAssetExplain(String assetExplain) {
        this.assetExplain = assetExplain;
    }

    public AssetTypeBean getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetTypeBean assetType) {
        this.assetType = assetType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsCheck() {
        return isCheck;
    }

    public void setIsCheck(boolean isCheck) {
        this.isCheck = isCheck;
    }

    public static class AssetTypeBean implements Serializable, Parcelable {
        /**
         * id : 0
         * name : string
         */

        private int id;
        private String name;

        public AssetTypeBean() {
        }

        protected AssetTypeBean(Parcel in) {
            id = in.readInt();
            name = in.readString();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(id);
            dest.writeString(name);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<AssetTypeBean> CREATOR = new Creator<AssetTypeBean>() {
            @Override
            public AssetTypeBean createFromParcel(Parcel in) {
                return new AssetTypeBean(in);
            }

            @Override
            public AssetTypeBean[] newArray(int size) {
                return new AssetTypeBean[size];
            }
        };

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
}
