package com.sunnyweather.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {
    public static final String TOKEN ="zq2V466VstoxArpn" ;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    /**
     * 获取全局上下文*/
    public static Context getContext() {
        return context;
    }
    private static String Token="zq2V466VstoxArpn";

}
