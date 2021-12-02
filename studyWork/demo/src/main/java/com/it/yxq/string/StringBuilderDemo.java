package com.it.yxq.string;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yxq
 * @data 2021/12/1 21:58
 */
public class StringBuilderDemo {

    @Test
    public void test1(){
        Long startTime =System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "六六六";
        }

        Long endTime =System.currentTimeMillis();
        Long time = (endTime - startTime);
        System.out.println(time);
    }
    @Test
    public void test3(){
        Long startTime =System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            result.append("六六六");

        }
        Long endTime =System.currentTimeMillis();
        Long time =(endTime-startTime);
        System.out.println(time);



    }

    /**
     * 案例2：判断一个字符串
     * 由3个字母组成
     * 第一个字母是 a/b/c
     * 第二个字母是 d/e/f/g
     * 第三个字母是 x/y/z
     */
    @Test
    public void test4(){
        String str = "agx";

        // 指定判断规则(中括号内字符顺序随便)
        Pattern p = Pattern.compile("[abc][edgf][xzy]");
        // 进行规则匹配
        Matcher m = p.matcher(str);
        // 进行判断
        boolean b = m.matches();
        System.out.println(b);
    }
}
