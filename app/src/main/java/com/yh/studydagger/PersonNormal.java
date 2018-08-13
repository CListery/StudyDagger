package com.yh.studydagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Clistery on 18-8-13.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface PersonNormal {
}
