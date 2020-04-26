package com.ubtech.common;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Copyright (C), 2016-2020
 * FileName: JsonServiceImpl
 * Author: wei.zheng
 * Date: 2020/4/26 13:04
 * Description: 序列化服务实现类
 */
@Route(path = "/service/json")
public class JsonServiceImpl implements SerializationService {
    private Gson gson;

    @Override
    public <T> T json2Object(String input, Class<T> clazz) {
        return gson.fromJson(input, clazz);
    }

    @Override
    public String object2Json(Object instance) {
        return gson.toJson(instance);
    }

    @Override
    public <T> T parseObject(String input, Type clazz) {
        return gson.fromJson(input, clazz);
    }

    @Override
    public void init(Context context) {
        gson = new Gson();
    }
}
