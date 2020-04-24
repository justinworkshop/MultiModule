package com.ubtech.multimodule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void jump(View view) {
        ARouter.getInstance().build("/app/TestActivity").navigation();
    }

    public void jumpOrder(View view) {
        ARouter.getInstance().build("/order/Order_MainActivity").navigation();
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
}
