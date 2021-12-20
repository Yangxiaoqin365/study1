package com.it.yxq.单例;

/**
 * 懒汉式 -单例
 */
public class Demo2 {
    public static void main(String[] args) {

        Bank2 bank2 = Bank2.getBank2();
        Bank2 bank22 = Bank2.getBank2();
        System.out.println(bank22==bank2);
    }
}


class Bank2{



    //1.私有构造方法
    private Bank2 (){}
    //2.提供类的实例
    private static Bank2 bank2=null;
    //3.提供公共的方法获取类的实例
    public static Bank2 getBank2(){
        if (bank2 == null) {
            bank2 =new Bank2();
        }
        return bank2;
    }
}
