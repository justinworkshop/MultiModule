package com.ubtech.order.debug;

import android.app.Application;
import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: Order_DebugApplication
 * Author: zhengwei
 * Date: 2020-05-25 18:00
 * Description: debug测试类
 */
public class Order_DebugApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("Order", "order/debug/Order_DebugApplication");
    }
}
