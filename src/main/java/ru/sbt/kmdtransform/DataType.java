package ru.sbt.kmdtransform;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DataType {
    TransformType value();
}
