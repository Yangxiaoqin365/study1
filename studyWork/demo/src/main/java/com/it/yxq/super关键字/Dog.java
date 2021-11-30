package com.it.yxq.super关键字;

/**
 * @author yxq
 * @data 2021/11/29 22:08
 */
public class Dog extends Animal{
    Dog(){
        super();//默认情况下super关键字是省略的
        System.out.println("狗狗来了");
    }
}
