package com.arcsoft.arcfacedemo;

import android.app.Application;

//ArcFaceApp()用于获取Application的一个对象实例：
public class ArcFaceApp extends Application {
    public static Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }
//获取application
    public static Application getApplication() {
        return application;
    }
}
