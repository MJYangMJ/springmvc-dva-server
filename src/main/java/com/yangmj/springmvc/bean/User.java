package com.yangmj.springmvc.bean;

public class User {

    private int id;
    private String name;
    private String gender;
    private String key;

    public User(int id, String name, String gender, String key) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.key = key;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
