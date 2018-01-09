package com.nongfenqi.controller.model.message;

/**
 * 消息未读数量
 *
 * @author guixiaoyuan
 * @version 2.4, 2017/11/29
 * @since [sherlock/V2.4.5]
 */
public class MessageNumberModel {
    /**
     * buInUnreadAmount 业务未读
     * puInUnreadAmount 公告未读
     * syInUnreadAmount 系统未读
     */
    private int buInUnreadAmount;
    private int puInUnreadAmount;
    private int syInUnreadAmount;

    public int getBuInUnreadAmount() {
        return buInUnreadAmount;
    }

    public void setBuInUnreadAmount(int buInUnreadAmount) {
        this.buInUnreadAmount = buInUnreadAmount;
    }

    public int getPuInUnreadAmount() {
        return puInUnreadAmount;
    }

    public void setPuInUnreadAmount(int puInUnreadAmount) {
        this.puInUnreadAmount = puInUnreadAmount;
    }

    public int getSyInUnreadAmount() {
        return syInUnreadAmount;
    }

    public void setSyInUnreadAmount(int syInUnreadAmount) {
        this.syInUnreadAmount = syInUnreadAmount;
    }
}
