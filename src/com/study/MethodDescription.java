package com.study;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodDescription {
    int key();
    String value() default "no description";
}
