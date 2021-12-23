package com.it.yxq.jiecheng阶乘;

/**
 * @author 杨晓钦
 * @since 2021/12/17 10:15
 */
public class DemoJieCheng {


    public static void main(String[] args) {
        int jiecheng = jiecheng(4);
        System.out.println(jiecheng);
    }

    private static int jiecheng(Integer n){
        if (n == 1) {
            return 1;
        }else {
            return n * jiecheng(n - 1);
        }
    }
}
