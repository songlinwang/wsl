package com.netease.wsl.meta;

import org.apache.ibatis.type.Alias;

/**
 * Author wsl
 * Date 2018/11/16
 */
@Alias("user")
public class User {
    private int id;
    private String name;
    private String region;
    private int age;
    private int sex; // 1表示男 2表示女

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
