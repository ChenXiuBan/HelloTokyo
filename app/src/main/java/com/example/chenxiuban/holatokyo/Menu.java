package com.example.chenxiuban.holatokyo;

import android.app.Activity;
import android.os.Bundle;

import com.anupcowkur.wheelmenu.WheelMenu;

/**
 * Created by ChenXiuBan on 2016/12/29.
 */
public class Menu extends Activity {


    WheelMenu wheelMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        
        wheelMenu= (WheelMenu) findViewById(R.id.wheelMenu);
        wheelMenu.setDivCount(12);
        wheelMenu.setWheelImage(R.mipmap.ic_launcher);
    }
}
