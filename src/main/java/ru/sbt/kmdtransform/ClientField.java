package ru.sbt.kmdtransform;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ClientField {
    String value();
}
