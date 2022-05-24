package com.szjt.reactservice.domain;

import java.io.Serializable;

public class Role implements Serializable {
    private static final long serialVersionUID = -4055044179949729828L;

    private String id;

    private String role;

    private String desc;

    public Role() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", role='" + role + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
