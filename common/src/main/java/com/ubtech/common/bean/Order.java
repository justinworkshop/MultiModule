package com.ubtech.common.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Copyright (C), 2016-2020
 * FileName: Order
 * Author: wei.zheng
 * Date: 2020/4/26 12:20
 * Description: $
 */
public class Order implements Parcelable {
    private long id;
    private String desc;
    private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.desc);
        dest.writeInt(this.price);
    }

    public Order() {
    }

    protected Order(Parcel in) {
        this.id = in.readLong();
        this.desc = in.readString();
        this.price = in.readInt();
    }

    public static final Creator<Order> CREATOR = new Creator<Order>() {
        @Override
        public Order createFromParcel(Parcel source) {
            return new Order(source);
        }

        @Override
        public Order[] newArray(int size) {
            return new Order[size];
        }
    };
}
