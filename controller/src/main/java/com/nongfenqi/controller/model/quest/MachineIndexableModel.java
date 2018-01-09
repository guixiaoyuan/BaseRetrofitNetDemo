package com.nongfenqi.controller.model.quest;

import me.yokeyword.indexablerv.IndexableEntity;

/**
 * @author jiezhi
 * @version 1.0, 20/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class MachineIndexableModel implements IndexableEntity {
    private static final String TAG = MachineIndexableModel.class.getSimpleName();

    private String id;
    private String name;
    private String pinyin;
    private boolean isSelected;
    private String machineContext;

    public String getMachineContext() {
        return machineContext;
    }

    public void setMachineContext(String machineContext) {
        this.machineContext = machineContext;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    private MachineIndexableModel(Builder builder) {
        setId(builder.id);
        setName(builder.name);
        setPinyin(builder.pinyin);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Override
    public String getFieldIndexBy() {
        return name;
    }

    @Override
    public void setFieldIndexBy(String indexField) {
        this.name = indexField;
    }

    @Override
    public void setFieldPinyinIndexBy(String pinyin) {
        this.pinyin = pinyin;
    }

    public static final class Builder {
        private String name;
        private String pinyin;
        private String id;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder pinyin(String val) {
            pinyin = val;
            return this;
        }

        public MachineIndexableModel build() {
            return new MachineIndexableModel(this);
        }

        public Builder id(String val) {
            id = val;
            return this;
        }
    }

}
