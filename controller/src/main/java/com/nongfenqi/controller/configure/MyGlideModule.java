package com.nongfenqi.controller.configure;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.module.GlideModule;

/**
 * @author jiezhi
 * @version 2.1, 06/07/2017
 * @since [sherlock/V2.1.0]
 */
public class MyGlideModule implements GlideModule{
    private static final String TAG = MyGlideModule.class.getSimpleName();

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {

    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
