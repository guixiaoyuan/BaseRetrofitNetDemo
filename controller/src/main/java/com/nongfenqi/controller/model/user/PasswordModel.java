package com.nongfenqi.controller.model.user;

/**
 * 修改密码
 *
 * @author luzhichao
 * @version 1.0, 17/5/3
 * @since [sherlock/V1.0.0]
 */

public class PasswordModel {
    private static final String TAG = PasswordModel.class.getSimpleName();


    /**
     * newPassword : new
     * oldPassword : old
     */

    private String newPassword;
    private String oldPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
}
