package com.nongfenqi.controller.model.message;

import com.nongfenqi.controller.model.common.StateModel;

import java.io.Serializable;

/**
 * 消息详情
 *
 * @author guixiaoyuan
 * @version 2.4, 2017/11/29
 * @since [sherlock/V2.4.5]
 */
public class MessageDetailModel implements Serializable{
    private int id;
    private String userId;
    private String userName;
    private String addTime;
    private String content;
    private String name;
    private StateModel readStatus;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StateModel getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(StateModel readStatus) {
        this.readStatus = readStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "id = "+id +"/n" +
                "userId = " + userId + "/n" +
                "userName = " + userName + "/n" +
                "addTime = " + addTime + "/n" +
                "content = " + content + "/n" +
                "name = " + name + "/n" +
                "readStatus = " + readStatus;
    }
}
