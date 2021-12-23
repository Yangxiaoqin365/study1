package com.it.yxq.题;

/**
 * @author 杨晓钦
 * @since 2021/12/21 9:38
 */
public class Demo {

    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] argv) {
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }
    }


}
