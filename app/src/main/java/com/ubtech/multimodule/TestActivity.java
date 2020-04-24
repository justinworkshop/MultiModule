package com.ubtech.multimodule;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Copyright (C), 2016-2020
 * FileName: TestActivity
 * Author: wei.zheng
 * Date: 2020/4/24 14:43
 * Description: $
 */
@Route(path = "/app/TestActivity")
public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
}
