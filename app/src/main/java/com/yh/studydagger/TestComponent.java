package com.yh.studydagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Clistery on 18-8-13.
 */
@Singleton
@Component(modules = TestModule.class)
public interface TestComponent {
    
    void inject(MainAct.Test test);
    
}
