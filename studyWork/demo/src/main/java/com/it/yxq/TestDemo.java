package com.it.yxq;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 杨晓钦
 * @since 2021/11/9 14:53
 */
@Slf4j
public class TestDemo {
    /*// 常量A
    public static final String A;

    // 常量B
    public static final String B;
    static {
        A = "ab"; B = "cd";
    }*/
    public static final String A = "ab";
    // 常量B
    public static final String B = "cd";

    public static void main(String[] args) {
        // 将两个常量用+连接对s进行初始化
        /*String s = A + B;
        String t = "abcd";
        if (s == t) {
            System.out.println("s等于t，它们是同一个对象");
        } else {
            System.out.println("s不等于t，它们不是同一个对象");
        }*/
        final int x;

        x=1;

        //反射
        //.class获取对象
        System.out.println(int.class==Integer.TYPE);

        System.out.println(int.class);
        System.out.println(Integer.class);
        System.out.println(int.class==Integer.class);
        //通过class的forName("String name")
        try {
            Class<?> aClass = Class.forName("java.lang.String");
            Object o = aClass.newInstance();
            System.out.println(aClass);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        //通过类对象实例的getClass（）方法
        Integer integer=new Integer("2");
        int i=1;
        Zilei zilei=new Zilei();
        Class<? extends Zilei> aClass1 = zilei.getClass();
        System.out.println(aClass1);
        Class<? extends Integer> aClass = integer.getClass();
        System.out.println(aClass);

    }

}
