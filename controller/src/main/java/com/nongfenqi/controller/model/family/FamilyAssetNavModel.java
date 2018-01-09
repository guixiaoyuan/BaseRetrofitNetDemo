package com.nongfenqi.controller.model.family;

/**
 * 家庭资产
 * @author luzhichao
 * @version 2.1, 17/5/27
 * @since [sherlock/V2.1.0]
 */

public class FamilyAssetNavModel {
    /**
     * carCount : 0
     * houseCount : 0
     * otherCount : 0
     */

    private int carCount;
    private int houseCount;
    private int otherCount;

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(int houseCount) {
        this.houseCount = houseCount;
    }

    public int getOtherCount() {
        return otherCount;
    }

    public void setOtherCount(int otherCount) {
        this.otherCount = otherCount;
    }
}
