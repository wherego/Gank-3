package com.zou.gank.app;

import android.app.Application;

import com.orhanobut.logger.Logger;
import com.zou.gank.common.Constent;

import butterknife.ButterKnife;

/**
 * <p>Created by Valjeta on 2016/4/28.</p>
 */
public class GankApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        Logger.init("Gank App")
                .setLogLevel(Constent.LOG_LEVEL);

        ButterKnife.setDebug(Constent.DEBUG);
    }

}
