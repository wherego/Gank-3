package com.zou.gank.splash;

import android.graphics.drawable.Drawable;

import com.zou.gank.base.BasePresenter;
import com.zou.gank.base.IBaseView;

/**
 * <p>Created by Valjeta on 2016/4/28.</p>
 */
public interface SplashContact {

    interface View extends IBaseView {
        void showDefaultImage();

        void showGirlImage(Drawable drawable);

    }

    interface Presenter extends BasePresenter {
        void delayEnterMain();

        void pickImage();
    }


}
