package com.it.yxq.单例;

/**
 * 饿汉式  单例
 */
public class Demo1 {
    //保证整个系统中，对某一个对象只能保证一个对象的实例

    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Bank bank2 = Bank.getBank();
        System.out.println(bank2==bank);

    }


}

class Bank{
    //1、私有化构造方法
    private Bank(){

    }
    //2.内部提供当前类的一个实例
    private static Bank bank =new Bank();

    //3.提供一个公共的获取实例的方法
    public static Bank getBank(){
        return bank;
    }
}

