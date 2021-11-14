package com.it.yxq.reflex;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author 杨晓钦
 * @since 2021/11/11 15:35
 */
@Slf4j
public class testDemo {

    public static void main(String[] args) {
        /*try {
            Class<?> aClass = Class.forName("com.it.yxq.reflex.Apple");
            Method method = aClass.getMethod("setPrice", int.class);
            Object o = aClass.newInstance();
            method.invoke(o, 3);
            System.out.println(o);
        } catch (Exception e) {

        }*/
        try {

            Class cla = Apple.class;
            Constructor constructor = cla.getConstructor(String.class, int.class);
            Object name = constructor.newInstance("aa", 2);
            System.out.println(name);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }

    }
}
