package com.easy.archiecture.entity;

import java.io.Serializable;

public class User implements Serializable {
    private int uid;
    private String name;
    private String phone;
    private String password;
    private String address;
    private int grade;

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public User(int uid, String name, String phone, String password, String address, int grade) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.address = address;
        this.grade = grade;
    }

    public User(String name, String phone, String password, String address, int grade) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.address = address;
        this.grade = grade;
    }
}
