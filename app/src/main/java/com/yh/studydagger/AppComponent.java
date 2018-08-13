package com.yh.studydagger;

import android.content.Context;

import dagger.Component;

/**
 * Created by Clistery on 18-8-13.
 */
@Component(modules = AppModule.class)
public interface AppComponent {
    
    Context providerCtx();
    
}
