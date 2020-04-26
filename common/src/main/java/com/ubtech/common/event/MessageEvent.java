package com.ubtech.common.event;

/**
 * Copyright (C), 2016-2020
 * FileName: MessageEvent
 * Author: wei.zheng
 * Date: 2020/4/26 12:28
 * Description: $
 */
public class MessageEvent {
    private String type;
    private int value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MessageEvent{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
