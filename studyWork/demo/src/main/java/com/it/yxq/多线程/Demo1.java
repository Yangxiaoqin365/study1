package com.it.yxq.多线程;

/**
 * @author 杨晓钦
 * @since 2021/12/21 15:08
 */
public class Demo1 {
    public static void main(String[] args) {
        MyThreadTest myThreadTest =new MyThreadTest();
        myThreadTest.start();
    }
}

 class MyThreadTest extends Thread{
    @Override
    public void run() {
        System.out.println("run....");
    }
}
