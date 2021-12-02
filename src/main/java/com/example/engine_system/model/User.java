package com.example.engine_system.model;

public class User {
    private String userName;
    private String password;
    private String avatar;
    private String name;
    private String userId;

    public User(String userName, String password, String avatar, String name, String userId) {
        this.userName = userName;
        this.password = password;
        this.avatar = avatar;
        this.name = name;
        this.userId = userId;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
