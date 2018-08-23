package com.iokfine.common.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1138513244885695035L;

    private String username;

    private String pwd;

    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
