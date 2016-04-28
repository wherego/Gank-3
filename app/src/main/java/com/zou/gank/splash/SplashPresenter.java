package com.zou.gank.splash;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * <p>Created by Valjeta on 2016/4/28.</p>
 */
public class SplashPresenter implements SplashContact.Presenter {

    private final Context mContext;
    private final SplashContact.View mView;

    public SplashPresenter(Context context, SplashContact.View view) {
        mContext = context;
        mView = view;
    }

    @Override
    public void delayEnterMain() {
        Observable.timer(5,TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(aLong -> {

                });

    }

    @Override
    public void pickImage() {
        mView.showDefaultImage();
    }
}
