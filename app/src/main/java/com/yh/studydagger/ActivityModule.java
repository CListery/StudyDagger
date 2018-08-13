package com.yh.studydagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Clistery on 18-8-13.
 */
@Module
public class ActivityModule {
    
    @PersonNormal
    @Provides
    Person providerPerson() {
        return new Person();
    }
    
    @PersonCtx
    @Provides
    Person providerPersonCtx(Context context) {
        return new Person(context);
    }
    
}
