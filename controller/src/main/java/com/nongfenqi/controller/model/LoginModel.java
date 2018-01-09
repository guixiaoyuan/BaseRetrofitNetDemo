package com.nongfenqi.controller.model;

/**
 * @author jiezhi
 * @version 1.0, 13/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class LoginModel {
    private static final String TAG = LoginModel.class.getSimpleName();

    /**
     * java
     * password : hello
     * userDevice : {"deviceName":"string","platform":0,"uuid":"63dff528-b645-449f-bc84-a95a8222a6b4","version":"string"}
     * username : hello
     */

    private String password;
    private UserDeviceModel userDevice;
    private String username;

    private LoginModel(Builder builder) {
        password = builder.password;
        userDevice = builder.userDevice;
        username = builder.username;
    }


    public String getPassword() {
        return password;
    }

    public UserDeviceModel getUserDevice() {
        return userDevice;
    }

    public String getUsername() {
        return username;
    }

    public static final class Builder {
        private String password;
        private UserDeviceModel userDevice;
        private String username;

        public Builder() {
        }

        public Builder password(String val) {
            password = val;
            return this;
        }

        public Builder userDevice(UserDeviceModel val) {
            userDevice = val;
            return this;
        }

        public Builder username(String val) {
            username = val;
            return this;
        }

        public LoginModel build() {
            return new LoginModel(this);
        }
    }
}
