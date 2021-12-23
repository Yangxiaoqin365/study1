package com.it.yxq.多线程2;

public class Windows {
    public static void main(String[] args) {
        WindowsThred thred=new WindowsThred();
        WindowsThred thred2=new WindowsThred();
        WindowsThred thred3=new WindowsThred();
        thred.setName("线程一");
        thred2.setName("线程er");
        thred3.setName("线程san");

        thred.start();
        thred2.start();
        thred3.start();
    }
}


class WindowsThred extends Thread{
    private static int ticket =100;
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(getName()+":卖票，票号："+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
