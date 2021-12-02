package com.it.yxq.string;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import org.junit.Test;

/**
 * 字符串常量池
 * @author 杨晓钦
 * @since 2021/12/1 10:55
 */
public class StringDemo2 {
    public static void main(String[] args) {



    }

    /**
     * 常量池
     */
    @Test
    public void str1(){
        //创建了两个对象，在字符串常量池中创建了“糖哥”对象，在堆中也创建了，
        String s1= new String("糖哥");//s1就是堆中对象的引用
        String s2 = s1.intern();//s1在字符串常量池中找到了“糖哥”对象，所以s2是常量池的引用
        System.out.println(s1==s2);//false
    }
    @Test
    public void str2(){
        String s1=new String("哈哈")+new String("嘿嘿");
        String s2 = s1.intern();
        System.out.println(s1==s2);
    }

    @Test
    public void str3(){
        final String s1 = "a";
        final String s2 = "b";
        String s3 = "ab";
        //String s4 = "a"+"b";
        String s4 = s1+s2;

        System.out.println(s3==s4);
    }

    @Test
    public void str4(){
        String s = null;
        s += "abc";
        System.out.println(s);
    }

    @Test
    public void str5(){
        String s1=new String("a") + new String("b");
        String s2 = s1.intern();
        System.out.println(s1==s2);
    }


}
