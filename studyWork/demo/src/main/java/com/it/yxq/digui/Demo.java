package com.it.yxq.digui;

/**
 * @author 杨晓钦
 * @since 2021/12/17 10:26
 */
public class Demo {


    public static void main(String[] args) {
        int f = f3(4);
        System.out.println(f);


        for (int i = 1; i <=4 ; i++) {
            System.out.println(f3(i));
        }
    }
    //计算 斐波那契数列 ，给定一个n值
    private static int f3(int n){
        if (n == 1 || n == 2) {
            return 1;
        }else {
            return f3(n - 1) + f3(n - 2);
        }
    }

    private static  int f(int n){
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        }else {
            return 2*f(n-1) + f(n-2);
        }
    }

    private static int f2(int n){
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return  4;
        }else {
            return f2(n + 2) - 2 * f2(n + 1);
        }
    }


}
