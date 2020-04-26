package com.ubtech.common.bean;

/**
 * Copyright (C), 2016-2020
 * FileName: PersonInfo
 * Author: wei.zheng
 * Date: 2020/4/26 13:38
 * Description: 个人信息
 */
public class PersonInfo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
