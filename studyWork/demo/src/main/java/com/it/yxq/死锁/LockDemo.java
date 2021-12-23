package com.it.yxq.死锁;

/**
 * @author 杨晓钦
 * @since 2021/12/22 14:56
 */
class Windows implements Runnable{
    private int ticket =100;
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票，票号" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
public class LockDemo {

    public static void main(String[] args) {
        Windows windows=new Windows();
        Thread thread1 = new Thread(windows);
        Thread thread2 = new Thread(windows);
        Thread thread3 = new Thread(windows);

        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
