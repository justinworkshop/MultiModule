package com.ubtech.order;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ubtech.common.bean.PersonInfo;
import com.ubtech.common.event.MessageEvent;
import com.ubtech.order.bean.TestOrder;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

@Route(path = "/order/Order_MainActivity")
public class Order_MainActivity extends AppCompatActivity {

    @Autowired
    public String name;
    @Autowired
    public int age;
    @Autowired
    public Bundle bundle;
    @Autowired(name = "testOrder")
    public TestOrder testOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);

        ARouter.getInstance().inject(this);
        System.out.println("Order data: " + name + ", " + age + ", order:" + bundle.get("order"));

        System.out.println("Order data from Intent: " + getIntent().getParcelableExtra("p"));

        System.out.println("Order testOrder: " + testOrder);
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {
        System.out.println("Order EventBus event: " + event);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    public void jumpPersonal(View view) {
        PersonInfo personInfo = new PersonInfo();
        personInfo.setName("justin");
        personInfo.setAge(20);

        ARouter.getInstance().build("/personal/Personal_MainActivity")
                .withObject("person", personInfo)
                .navigation();
    }
}
