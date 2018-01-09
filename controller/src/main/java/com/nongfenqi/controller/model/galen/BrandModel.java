package com.nongfenqi.controller.model.galen;

/**
 * 农机
 *
 * @author jiezhi
 * @version 1.0, 21/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class BrandModel {
    private static final String TAG = BrandModel.class.getSimpleName();

    private String id;
    private String name;

    private BrandModel(Builder builder) {
        setId(builder.id);
        setName(builder.name);
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

    public static final class Builder {
        private String id;
        private String name;

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

        public BrandModel build() {
            return new BrandModel(this);
        }
    }
}
