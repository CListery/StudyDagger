package com.yh.studydagger;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;

/**
 * Created by Clistery on 18-8-13.
 */
public class MainAct extends Activity {
    
    @PersonNormal @Inject Person personNormal;
    @PersonNormal @Inject Lazy<Person> lazyPerson;
    
    @PersonCtx @Inject Person personCtx;
    @PersonCtx @Inject Provider<Person> providerPerson;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainAct", "onCreate");
        TestComponent tc = DaggerTestComponent.create();
        new Test(tc);
        new Test(tc);
        
        AppComponent appC = DaggerAppComponent.builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();
        ActivityComponent ac = DaggerActivityComponent.builder()
                .appComponent(appC)
                .activityModule(new ActivityModule())
                .build();
        ac.inject(this);
        Log.d("MainAct", "onCreate inject done");
        Log.d("MainAct", "onCreate: " + personNormal);
        Log.d("MainAct", "onCreate: " + personCtx);
        
        personCtx = personNormal = null;
        
        Log.d("MainAct", "onCreate: start lazy and provider init");
        personNormal = lazyPerson.get();//懒加载
        Log.d("MainAct", "onCreate: p " + personNormal);
        personNormal = lazyPerson.get();//对象不改变
        Log.d("MainAct", "onCreate: p " + personNormal);
        
        personCtx = providerPerson.get();//强制重新加载
        Log.d("MainAct", "onCreate: p2 " + personCtx);
        personCtx = providerPerson.get();//强制重新加载
        Log.d("MainAct", "onCreate: p2 " + personCtx);
        
    }
    
    public class Test {
        @Inject Person person;
        
        public Test(TestComponent tc) {
            tc.inject(this);
            Log.d("Test", "create: " + person);
        }
    }
    
}
