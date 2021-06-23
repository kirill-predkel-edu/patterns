package com.study;
import java.lang.reflect.Method;

public class TestClass {

    @MethodDescription(key = 1, value = "Cycle \"For\"")
    public void testMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        Method[] m = getClass().getMethods();
        Method method = m[0];
        MethodDescription annotation = method.getAnnotation(MethodDescription.class);

        System.out.println(annotation.value());
        System.out.println(annotation.key());
    }
}
