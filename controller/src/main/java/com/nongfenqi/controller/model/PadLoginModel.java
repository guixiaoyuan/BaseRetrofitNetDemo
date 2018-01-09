package com.nongfenqi.controller.model;

/**
 * pad登录实体
 *
 * @author luzhichao
 * @version 2.3, 2017/10/11
 * @since [sherlock/V2.3.5]
 */

public class PadLoginModel {
    /**
     * code : 9999
     * password : admin123
     * sendCodeAgain : 1
     * type : 1
     * userDevice : {"deviceName":"string","platform":0,"uuid":"63dff528-b645-449f-bc84-a95a8222a6b4","version":"string"}
     * username : admin
     */

    private String username;
    private String password;
    private String code;
    private int sendCodeAgain;
    private int type;
    private UserDeviceModel userDevice;

    public PadLoginModel() {
    }

    private PadLoginModel(Builder builder) {
        setUsername(builder.username);
        setPassword(builder.password);
        setCode(builder.code);
        setSendCodeAgain(builder.sendCodeAgain);
        setType(builder.type);
        setUserDevice(builder.userDevice);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSendCodeAgain(int sendCodeAgain) {
        this.sendCodeAgain = sendCodeAgain;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUserDevice(UserDeviceModel userDevice) {
        this.userDevice = userDevice;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCode() {
        return code;
    }

    public String getPassword() {
        return password;
    }

    public int getSendCodeAgain() {
        return sendCodeAgain;
    }

    public int getType() {
        return type;
    }

    public UserDeviceModel getUserDevice() {
        return userDevice;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "PadLoginModel{" +
                "code='" + code + '\'' +
                ", password='" + password + '\'' +
                ", sendCodeAgain=" + sendCodeAgain +
                ", type=" + type +
                ", userDevice=" + userDevice +
                ", username='" + username + '\'' +
                '}';
    }

    public static final class Builder {
        private String username;
        private String password;
        private String code;
        private int sendCodeAgain;
        private int type;
        private UserDeviceModel userDevice;

        public Builder() {
        }

        public Builder username(String val) {
            username = val;
            return this;
        }

        public Builder password(String val) {
            password = val;
            return this;
        }

        public Builder code(String val) {
            code = val;
            return this;
        }

        public Builder sendCodeAgain(int val) {
            sendCodeAgain = val;
            return this;
        }

        public Builder type(int val) {
            type = val;
            return this;
        }

        public Builder userDevice(UserDeviceModel val) {
            userDevice = val;
            return this;
        }

        public PadLoginModel build() {
            return new PadLoginModel(this);
        }
    }
}
