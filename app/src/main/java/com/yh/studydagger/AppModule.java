package com.yh.studydagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Clistery on 18-8-13.
 */
@Module
public class AppModule {
    
    private Context mCtx;
    
    public AppModule(Context context) {
        this.mCtx = context;
    }
    
    @Provides
    Context providerCtx(){
        return mCtx;
    }
    
}
