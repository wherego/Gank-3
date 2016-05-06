package com.zou.gank.splash;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.zou.gank.R;
import com.zou.gank.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * splash 页面
 */
public class SplashActivity extends BaseActivity<SplashContact.Presenter> implements SplashContact.View {

    @Bind(R.id.iv_splash_pic)
    ImageView splashIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        mPresenter = new SplashPresenter(this);
        init();
    }

    private void init() {
        mPresenter.pickImage();
        mPresenter.delayEnterMain();
    }

    @Override
    public void showDefaultImage() {
        splashIv.setImageResource(R.drawable.image_default_splash);
    }

    @Override
    public void showGirlImage(Drawable drawable) {
        splashIv.setImageDrawable(drawable);
    }


}
