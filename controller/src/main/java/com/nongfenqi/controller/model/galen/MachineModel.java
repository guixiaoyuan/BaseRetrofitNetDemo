package com.nongfenqi.controller.model.galen;

/**
 * @author jiezhi
 * @version 1.0, 21/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class MachineModel {
    private static final String TAG = MachineModel.class.getSimpleName();


    /**
     * brandId : string
     * brandName : string
     * description : string
     * id : string
     * machineModel : string
     * machineTypeId : string
     * machineTypeName : string
     * name : string
     */
    private String brandId;
    private String brandName;
    private String description;
    private String id;
    private String machineModel;
    private String machineTypeId;
    private String machineTypeName;
    private String name;

    private MachineModel(Builder builder) {
        setBrandId(builder.brandId);
        setBrandName(builder.brandName);
        setDescription(builder.description);
        setId(builder.id);
        setMachineModel(builder.machineModel);
        setMachineTypeId(builder.machineTypeId);
        setMachineTypeName(builder.machineTypeName);
        setName(builder.name);
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMachineModel() {
        return machineModel;
    }

    public void setMachineModel(String machineModel) {
        this.machineModel = machineModel;
    }

    public String getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(String machineTypeId) {
        this.machineTypeId = machineTypeId;
    }

    public String getMachineTypeName() {
        return machineTypeName;
    }

    public void setMachineTypeName(String machineTypeName) {
        this.machineTypeName = machineTypeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static final class Builder {
        private String brandId;
        private String brandName;
        private String description;
        private String id;
        private String machineModel;
        private String machineTypeId;
        private String machineTypeName;
        private String name;

        public Builder() {
        }

        public Builder brandId(String val) {
            brandId = val;
            return this;
        }

        public Builder brandName(String val) {
            brandName = val;
            return this;
        }

        public Builder description(String val) {
            description = val;
            return this;
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder machineModel(String val) {
            machineModel = val;
            return this;
        }

        public Builder machineTypeId(String val) {
            machineTypeId = val;
            return this;
        }

        public Builder machineTypeName(String val) {
            machineTypeName = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public MachineModel build() {
            return new MachineModel(this);
        }
    }

    @Override
    public String toString() {
        return "MachineModel{" +
                "brandId='" + brandId + '\'' +
                ", brandName='" + brandName + '\'' +
                ", description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", machineModel='" + machineModel + '\'' +
                ", machineTypeId='" + machineTypeId + '\'' +
                ", machineTypeName='" + machineTypeName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
