package com.nongfenqi.controller.model;

/**
 * @author luzhichao
 * @version 2.3, 2017/10/11
 * @since [sherlock/V2.3.5]
 */

public class UserDeviceModel {
    /**
     * deviceName : string
     * platform : 0
     * uuid : 63dff528-b645-449f-bc84-a95a8222a6b4
     * version : string
     */

    private String deviceName;
    private int platform;
    private String uuid;
    private String version;
    private String channelId;

    public UserDeviceModel() {
    }

    private UserDeviceModel(Builder builder) {
        setDeviceName(builder.deviceName);
        setPlatform(builder.platform);
        setUuid(builder.uuid);
        setVersion(builder.version);
        setChannelId(builder.channelId);
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public int getPlatform() {
        return platform;
    }

    public String getUuid() {
        return uuid;
    }

    public String getVersion() {
        return version;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public static final class Builder {
        private String deviceName;
        private int platform;
        private String uuid;
        private String version;
        private String channelId;

        public Builder() {
        }

        public Builder deviceName(String val) {
            deviceName = val;
            return this;
        }

        public Builder platform(int val) {
            platform = val;
            return this;
        }

        public Builder uuid(String val) {
            uuid = val;
            return this;
        }

        public Builder version(String val) {
            version = val;
            return this;
        }

        public Builder channelId(String val) {
            channelId = val;
            return this;
        }

        public UserDeviceModel build() {
            return new UserDeviceModel(this);
        }
    }
}
