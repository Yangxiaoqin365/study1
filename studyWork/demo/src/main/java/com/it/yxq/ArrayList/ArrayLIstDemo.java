package com.it.yxq.ArrayList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author yxq
 * @data 2021/12/2 22:43
 */
public class ArrayLIstDemo {

    final int num = 10000;
    //ArrayList从头插入数据，耗时14毫秒
    @Test
    public void str1(){
        ArrayList<String> list=new ArrayList<>();
        int i=0;

        long startTime =System.currentTimeMillis();

        while (i < num) {
            list.add(0,i+"hah");
            i++;
        }
        System.out.println("时间为"+(System.currentTimeMillis()-startTime));

    }

    //LinkedList从头插入，耗时5毫秒
    @Test
    public void str2LinkedList(){
        LinkedList<String> list=new LinkedList<>();
        int i=0;

        long startTime =System.currentTimeMillis();

        while (i < num) {
            list.addFirst(i+"hah");
            i++;
        }
        System.out.println("时间为"+(System.currentTimeMillis()-startTime));

    }

    //ArrayList从中间插入数据，时间为7毫秒
    @Test
    public void str4(){
        ArrayList<String> list=new ArrayList<>(num);
        int i=0;
        long startTime =System.currentTimeMillis();
        while (i < num) {
            int temp = list.size();
            list.add(temp/2,i+"hah");
            i++;
        }
        System.out.println("时间为"+(System.currentTimeMillis()-startTime));
    }

    //LinkedList从中间插入数据，时间为40毫秒
    @Test
    public void str5(){
        LinkedList<String> list=new LinkedList<>();
        int i=0;
        long startTime =System.currentTimeMillis();
        while (i < num) {
            int temp = list.size();
            list.add(temp/2,i+"hah");
            i++;
        }
        System.out.println("时间为"+(System.currentTimeMillis()-startTime));
    }

    //ArrayList从末尾插入数据，时间为3毫秒
    @Test
    public void str6(){
        ArrayList<String> list=new ArrayList<>(num);
        int i=0;
        long startTime =System.currentTimeMillis();
        while (i < num) {
            list.add(i+"hah");
            i++;
        }
        System.out.println("时间为"+(System.currentTimeMillis()-startTime));
    }

    //LinkedList从末尾插入数据，时间为4毫秒
    @Test
    public void str7(){
        LinkedList<String> list=new LinkedList<>();
        int i=0;
        long startTime =System.currentTimeMillis();
        while (i < num) {
            list.add(i+"hah");
            i++;
        }
        System.out.println("时间为"+(System.currentTimeMillis()-startTime));
    }
}
