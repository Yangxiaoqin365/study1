package com.it.yxq.包装类;

import org.junit.Test;

public class Demo {


    @Test
    public void test1() {

        int i=1;

        Integer integer=new Integer(i);
        System.out.println(integer);


    }
    //包装类转换为基本数据类型，调用.xxxValue方法
    @Test
    public void test2(){
        Integer integer = new Integer(2);
        int i = integer.intValue();
        System.out.print(i);
    }
}
