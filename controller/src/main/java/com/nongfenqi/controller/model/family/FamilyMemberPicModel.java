package com.nongfenqi.controller.model.family;

/**
 * 家庭成员图片id
 *
 * @author luzhichao
 * @version 1.0, 17/4/20
 * @since [sherlock/V1.0.0]
 */

public class FamilyMemberPicModel {
    /**
     * id : 1
     * picGroupId : 0123
     */

    private int id;
    private String picGroupId;

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
}
