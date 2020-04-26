package com.ubtech.personal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ubtech.common.bean.PersonInfo;

@Route(path = "/personal/Personal_MainActivity")
public class Personal_MainActivity extends AppCompatActivity {
    @Autowired(name = "person")
    public PersonInfo personInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_activity_main);

        ARouter.getInstance().inject(this);

        System.out.println("Personal personInfo: " + personInfo);
    }
}
