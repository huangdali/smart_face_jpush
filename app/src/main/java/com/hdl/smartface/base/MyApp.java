package com.hdl.smartface.base;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * 应用启动类
 * Created by Admin on 2020/1/11.
 *
 * @author Admin
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initJpush();
    }

    /**
     * 初始化极光推送
     */
    private void initJpush() {
        //调试模式开关，正式版需设置未false
        JPushInterface.setDebugMode(true);
        //初始化极光推送
        JPushInterface.init(this);
    }
}
