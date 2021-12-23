package com.it.yxq.多线程;

/**
 * @author 杨晓钦
 * @since 2021/12/21 16:31
 */
public class MyThread2 extends Thread{
    @Override
    public void run() {
        //遍历一百以内的偶数
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread()+":"+i);
            }
        }
    }
}
