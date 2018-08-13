package com.yh.studydagger;

import dagger.Component;

/**
 * Created by Clistery on 18-8-13.
 */
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainAct act);

}
