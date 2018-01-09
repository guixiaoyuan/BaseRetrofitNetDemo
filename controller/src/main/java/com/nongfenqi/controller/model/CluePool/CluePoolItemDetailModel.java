package com.nongfenqi.controller.model.CluePool;

import com.nongfenqi.controller.model.common.LocationModel;
import com.nongfenqi.controller.model.common.StateModel;
import com.nongfenqi.controller.model.quest.ApplyArtificialModel;
import com.nongfenqi.controller.model.quest.ApplyMachineModel;
import com.nongfenqi.controller.model.quest.ApplyFarmWorkModel;
import com.nongfenqi.controller.model.quest.ApplyFoodStuffModel;
import com.nongfenqi.controller.model.quest.ApplyLandModel;
import com.nongfenqi.controller.model.quest.ApplyMaterialsModel;

import java.util.List;

/**
 * 线索池单个项目详情
 *
 * @author guixiaoyuan
 * @version 2.2, 2017/10/13
 * @since [sherlock/V2.2.5]
 */
public class CluePoolItemDetailModel {

    /**
     * "data": {
     * "applyId": "ED20171016103729",
     * "addUserId": "U1000012030",
     * "addUserName": "赵钊",
     * "addTime": "2017-10-16 10:16:59",
     * "applyUse": {
     * "customerId": null,
     * "useId": "AU20171016105054",
     * "dealerId": "T1103",
     * "dealerName": null,
     * "machineCode": "1",
     * "machineName": null,
     * "brandId": "233",
     * "brandName": "雷沃",
     * "machineTypeId": "T1100",
     * "machineTypeName": "拖拉机",
     * "price": 1233,
     * "applyAmount": 123,
     * "downPayment": null,
     * "description": "",
     * "payeeType": null,
     * "accountType": null,
     * "marginState": false,
     * "marginAmount": null,
     * "useType": null
     * },
     * "applyUseAgrMaterialsGoodsList": null,
     * "hasPresell": null,
     * "customerId": "C00000000820",
     * "customerName": "张彭",
     * "customerTypeName": "农户",
     * "managerUserId": "U1000012030",
     * "managerUserName": "赵钊",
     * "customerStar": {
     * "id": 1,
     * "name": "劣质客户"
     * },
     * "customerTraceStage": {
     * "id": 1,
     * "name": "跟进接洽"
     * },
     * "nowLivingLocation": {
     * "lon": 0,
     * "lat": 0,
     * "areaCode": "110101000000",
     * "fullAreaName": "北京市直辖区东城区",
     * "address": "雨花台铁心桥大街16号"
     * }
     * }
     */

    private String addTime;
    private String addUserId;
    private String addUserName;
    private String applyId;

    private ApplyMachineModel applyUseAgrMachine;//农机农补一个数据模型
    private ApplyMaterialsModel applyUseAgrMaterials;//肥宝宝
    private List<MaterialsInfo> applyUseAgrMaterialsGoodsList;
    private ApplyArtificialModel applyUseArtificial;
    private ApplyFarmWorkModel applyUseFarmWork;
    private ApplyFoodStuffModel applyUseFoodstuff;
    private ApplyLandModel applyUseLand;

    private String customerId;
    private String customerName;
    private StateModel customerStar;
    private StateModel customerTraceStage;
    private String customerTypeName;
    private StateModel hasPresell;
    private String managerUserId;
    private String managerUserName;
    private LocationModel nowLivingLocation;

    private String templateId;
    private String templateName;
    private StateModel useType;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public ApplyMachineModel getApplyUseAgrMachine() {
        return applyUseAgrMachine;
    }

    public void setApplyUseAgrMachine(ApplyMachineModel applyUseAgrMachine) {
        this.applyUseAgrMachine = applyUseAgrMachine;
    }

    public ApplyMaterialsModel getApplyUseAgrMaterials() {
        return applyUseAgrMaterials;
    }

    public void setApplyUseAgrMaterials(ApplyMaterialsModel applyUseAgrMaterials) {
        this.applyUseAgrMaterials = applyUseAgrMaterials;
    }

    public List<MaterialsInfo> getApplyUseAgrMaterialsGoodsList() {
        return applyUseAgrMaterialsGoodsList;
    }

    public void setApplyUseAgrMaterialsGoodsList(List<MaterialsInfo> applyUseAgrMaterialsGoodsList) {
        this.applyUseAgrMaterialsGoodsList = applyUseAgrMaterialsGoodsList;
    }

    public ApplyArtificialModel getApplyUseArtificial() {
        return applyUseArtificial;
    }

    public void setApplyUseArtificial(ApplyArtificialModel applyUseArtificial) {
        this.applyUseArtificial = applyUseArtificial;
    }

    public ApplyFarmWorkModel getApplyUseFarmWork() {
        return applyUseFarmWork;
    }

    public void setApplyUseFarmWork(ApplyFarmWorkModel applyUseFarmWork) {
        this.applyUseFarmWork = applyUseFarmWork;
    }

    public ApplyFoodStuffModel getApplyUseFoodstuff() {
        return applyUseFoodstuff;
    }

    public void setApplyUseFoodstuff(ApplyFoodStuffModel applyUseFoodstuff) {
        this.applyUseFoodstuff = applyUseFoodstuff;
    }

    public ApplyLandModel getApplyUseLand() {
        return applyUseLand;
    }

    public void setApplyUseLand(ApplyLandModel applyUseLand) {
        this.applyUseLand = applyUseLand;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public StateModel getCustomerStar() {
        return customerStar;
    }

    public void setCustomerStar(StateModel customerStar) {
        this.customerStar = customerStar;
    }

    public StateModel getCustomerTraceStage() {
        return customerTraceStage;
    }

    public void setCustomerTraceStage(StateModel customerTraceStage) {
        this.customerTraceStage = customerTraceStage;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public StateModel getHasPresell() {
        return hasPresell;
    }

    public void setHasPresell(StateModel hasPresell) {
        this.hasPresell = hasPresell;
    }

    public String getManagerUserId() {
        return managerUserId;
    }

    public void setManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
    }

    public String getManagerUserName() {
        return managerUserName;
    }

    public void setManagerUserName(String managerUserName) {
        this.managerUserName = managerUserName;
    }

    public LocationModel getNowLivingLocation() {
        return nowLivingLocation;
    }

    public void setNowLivingLocation(LocationModel nowLivingLocation) {
        this.nowLivingLocation = nowLivingLocation;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public StateModel getUseType() {
        return useType;
    }

    public void setUseType(StateModel useType) {
        this.useType = useType;
    }

    public class MaterialsInfo {
        private float discount;
        private String goodsId;
        private String goodsName;
        private int id;
        private float quantity;
        private float totalPrice;
        private float unitPrice;

        public float getDiscount() {
            return discount;
        }

        public void setDiscount(float discount) {
            this.discount = discount;
        }

        public String getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(String goodsId) {
            this.goodsId = goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public float getQuantity() {
            return quantity;
        }

        public void setQuantity(float quantity) {
            this.quantity = quantity;
        }

        public float getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(float totalPrice) {
            this.totalPrice = totalPrice;
        }

        public float getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(float unitPrice) {
            this.unitPrice = unitPrice;
        }
    }

}
