package com.ubtech.multimodule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ubtech.common.bean.Order;
import com.ubtech.common.event.MessageEvent;
import com.ubtech.order.bean.TestOrder;

import org.greenrobot.eventbus.EventBus;

@Route(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jump(View view) {
        ARouter.getInstance().build("/app/TestActivity").navigation();
        testEventBus();
    }

    public void jumpOrder(View view) {
        Order order = new Order();
        order.setId(1);
        order.setDesc("First order");
        order.setPrice(100);

        TestOrder testOrder = new TestOrder();
        testOrder.setName("Mac");
        testOrder.setPrice(10000);

        Bundle bundle = new Bundle();
        bundle.putParcelable("order", order);
        ARouter.getInstance().build("/order/Order_MainActivity")
                .withString("name", "zhengwei")
                .withInt("age", 18)
                .withBundle("bundle", bundle)
                .withParcelable("p", order)
                .withObject("testOrder", testOrder)
                .navigation();

//        Intent intent = new Intent();
////        intent.setClassName("com.ubtech.order", "com.ubtech.order.Order_MainActivity");
//        ComponentName componentName = new ComponentName("com.ubtech.order", "com.ubtech.order.Order_MainActivity");
//        intent.setComponent(componentName);
//        startActivity(intent);
    }

    public void jumpPersonal(View view) {
        try {
            Class<?> clazz = Class.forName("com.ubtech.personal.Personal_MainActivity");
            Intent intent = new Intent(MainActivity.this, clazz);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void testEventBus(){
        MessageEvent messageEvent = new MessageEvent();
        messageEvent.setType("bus");
        messageEvent.setValue(99);
        EventBus.getDefault().postSticky(messageEvent);

    }
}
