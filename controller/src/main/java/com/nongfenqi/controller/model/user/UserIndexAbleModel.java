package com.nongfenqi.controller.model.user;

import java.io.Serializable;

import me.yokeyword.indexablerv.IndexableEntity;

/**
 * @author luzhichao
 * @version 1.0, 17/3/23
 * @since [sherlock/V1.0.0]
 */

public class UserIndexAbleModel implements IndexableEntity, Serializable {
    private String name;
    private String deptName;
    private String userId;
    private String pinyin;

    private UserIndexAbleModel(Builder builder) {
        setName(builder.name);
        setDeptName(builder.deptName);
        setUserId(builder.userId);
        setPinyin(builder.pinyin);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getPinyin() {
        return pinyin;
    }

    @Override
    public String getFieldIndexBy() {
        return name;
    }

    @Override
    public void setFieldIndexBy(String indexField) {
        name = indexField;
    }

    @Override
    public void setFieldPinyinIndexBy(String pinyin) {
        this.pinyin = pinyin;
    }

    public static final class Builder {
        private String name;
        private String deptName;
        private String userId;
        private String pinyin;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder deptName(String val) {
            deptName = val;
            return this;
        }

        public Builder userId(String val) {
            userId = val;
            return this;
        }

        public Builder pinyin(String val) {
            pinyin = val;
            return this;
        }

        public UserIndexAbleModel build() {
            return new UserIndexAbleModel(this);
        }
    }
}
