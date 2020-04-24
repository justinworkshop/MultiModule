package com.ubtech.multimodule;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Copyright (C), 2016-2020
 * FileName: AppInit
 * Author: wei.zheng
 * Date: 2020/4/24 14:41
 * Description: $
 */
public class AppInit extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
        }

        ARouter.init(this);
    }
}
