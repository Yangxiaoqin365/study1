package com.it.yxq.多线程;

/**
 * @author 杨晓钦
 * @since 2021/12/21 16:34
 */
public class Demo2 {
    public static void main(String[] args) {
        MyThread2 myThread2=new MyThread2();
        MyThread3 myThread3=new MyThread3();
//        myThread2.start();
//        myThread3.start();
        String str = "";
        System.out.println(str.split(",").length);
    }
}
