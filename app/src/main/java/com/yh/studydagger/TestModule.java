package com.yh.studydagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Clistery on 18-8-13.
 */
@Module
public class TestModule {
    
    @Singleton
    @Provides
    Person providerPerson(){
        return new Person();
    }
    
}
