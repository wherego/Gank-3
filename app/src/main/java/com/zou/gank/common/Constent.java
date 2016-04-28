package com.zou.gank.common;

import com.orhanobut.logger.LogLevel;
import com.zou.gank.BuildConfig;

/**
 * <p>Created by Valjeta on 2016/4/28.</p>
 */
public class Constent {

    public static final boolean DEBUG = BuildConfig.DEBUG;

    public static final LogLevel LOG_LEVEL = BuildConfig.DEBUG ? LogLevel.FULL : LogLevel.NONE;

}
