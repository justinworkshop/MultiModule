package com.ubtech.order.bean;

/**
 * Copyright (C), 2016-2020
 * FileName: TestOrder
 * Author: wei.zheng
 * Date: 2020/4/26 13:08
 * Description: $
 */
public class TestOrder {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestOrder{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
