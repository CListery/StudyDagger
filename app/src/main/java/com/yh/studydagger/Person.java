package com.yh.studydagger;

import android.content.Context;

/**
 * Created by Clistery on 18-8-13.
 */
public class Person {
    
    public Person() {
        Log.d("Person", "create!");
    }
    
    public Person(Context context) {
        Log.d("Person", "create ctx!");
    }
}
