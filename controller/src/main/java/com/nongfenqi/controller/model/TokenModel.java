package com.nongfenqi.controller.model;

import java.io.Serializable;

/**
 * 访问令牌实体
 *
 * @author luzhichao
 * @version 2.3, 2017/10/12
 * @since [sherlock/V2.3.5]
 */

public class TokenModel implements Serializable {
    /**
     * accessToken : string
     * expireIn : 86400000
     * grantTime : 86400000
     * refreshExpireIn : 86400000
     * refreshToken : string
     */

    private String accessToken;
    private String expireIn;
    private String grantTime;
    private String refreshExpireIn;
    private String refreshToken;

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setExpireIn(String expireIn) {
        this.expireIn = expireIn;
    }

    public void setGrantTime(String grantTime) {
        this.grantTime = grantTime;
    }

    public void setRefreshExpireIn(String refreshExpireIn) {
        this.refreshExpireIn = refreshExpireIn;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getExpireIn() {
        return expireIn;
    }

    public String getGrantTime() {
        return grantTime;
    }

    public String getRefreshExpireIn() {
        return refreshExpireIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }
}
