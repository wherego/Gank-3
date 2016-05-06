package com.zou.gank.splash;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * <p>Created by Valjeta on 2016/4/28.</p>
 */
public class SplashPresenter implements SplashContact.Presenter {

    private final SplashContact.View mView;

    public SplashPresenter(SplashContact.View view) {
        mView = view;
    }

    @Override
    public void delayEnterMain() {
        Observable.timer(3, TimeUnit.SECONDS)
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
