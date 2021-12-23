package com.it.yxq.多线程2;

import lombok.SneakyThrows;

public class MyRunnable {


    public static void main(String[] args) {
        MyRunnableTest test = new MyRunnableTest();

        Thread thread1 = new Thread(test);
        Thread thread2 = new Thread(test);
        Thread thread3 = new Thread(test);

        thread1.setName("线程一");
        thread2.setName("线程二");
        thread3.setName("线程三");
        thread3.start();
        thread1.start();
        thread2.start();

    }
}

class MyRunnableTest implements Runnable {
    private int ticket = 500;
    Object obj = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
