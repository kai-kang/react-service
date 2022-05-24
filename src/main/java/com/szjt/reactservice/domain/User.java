package com.szjt.reactservice.domain;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -407657271794588563L;
    private String id;

    @ApiModelProperty(value = "用户名称")
    private String userName;

    private String password;

    private String account;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", account='" + account + '\'' +
                '}';
    }
}
