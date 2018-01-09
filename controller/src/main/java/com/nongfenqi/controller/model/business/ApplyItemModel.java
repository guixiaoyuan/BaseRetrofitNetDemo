package com.nongfenqi.controller.model.business;

import java.io.Serializable;

/**
 * 项目查询
 *
 * @author jiezhi
 * @version 1.0, 14/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class ApplyItemModel implements Serializable {
    private static final String TAG = ApplyItemModel.class.getSimpleName();

    private String id;
    private String name;
    private int progress;

    private ApplyItemModel(Builder builder) {
        setId(builder.id);
        setName(builder.name);
        setProgress(builder.progress);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public static final class Builder {
        private String id;
        private String name;
        private int progress;

        public Builder() {
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder progress(int val) {
            progress = val;
            return this;
        }

        public ApplyItemModel build() {
            return new ApplyItemModel(this);
        }
    }
}
