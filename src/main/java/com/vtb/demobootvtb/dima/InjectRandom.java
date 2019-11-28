package com.vtb.demobootvtb.dima;/**
 * @author Evgeny Borisov
 */

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface InjectRandom {
    int min();
    int max();
}
