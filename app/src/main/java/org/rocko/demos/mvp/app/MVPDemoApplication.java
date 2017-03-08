package org.rocko.demos.mvp.app;

import android.app.Application;

import org.rocko.demos.mvp.util.volley.VolleyRequest;

/**
 * Created by itgoyo on 2017/3/8.
 * 替换默认的Application实现
 */
public class MVPDemoApplication extends Application {
    private static MVPDemoApplication instance;

    public MVPDemoApplication() {
        instance = this;
    }

    public static Application getContext() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        VolleyRequest.buildRequestQueue(this);
    }
}