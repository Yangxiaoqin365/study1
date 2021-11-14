package com.it.yxq;

/**
 * @author 杨晓钦
 * @since 2021/11/10 10:41
 */
public class Base {

    private void sayHi(){
        System.out.println("Base:hi");
    }
    public static void main(String[] args) {
        Base base=new Zilei();
        base.sayHi();
    }

}
