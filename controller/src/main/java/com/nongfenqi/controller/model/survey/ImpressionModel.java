package com.nongfenqi.controller.model.survey;

/**
 * 印象标签
 *
 * @author jiezhi
 * @version 1.0, 14/04/2017
 * @since [sherlock/V1.0.0]
 */
public class ImpressionModel {
    private static final String TAG = ImpressionModel.class.getSimpleName();
    /**
     * id : 1
     * impressionName : string
     */

    private int id;
    private String impressionName;

    private ImpressionModel(Builder builder) {
        setId(builder.id);
        setImpressionName(builder.impressionName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImpressionName() {
        return impressionName;
    }

    public void setImpressionName(String impressionName) {
        this.impressionName = impressionName;
    }

    public static final class Builder {
        private int id;
        private String impressionName;

        public Builder() {
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder impressionName(String val) {
            impressionName = val;
            return this;
        }

        public ImpressionModel build() {
            return new ImpressionModel(this);
        }
    }

}
