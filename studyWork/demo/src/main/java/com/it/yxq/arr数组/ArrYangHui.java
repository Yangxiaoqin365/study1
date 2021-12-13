package com.it.yxq.arr数组;

public class ArrYangHui {
    public static void main(String[] args) {

        //定义一个长度为10的二维数组
        int[][] arr=new int[10][];

        for (int i = 0; i < arr.length; i++) {
            //给数组赋值
            arr[i] = new int[i + 1];
            //给首尾赋值
            arr[i][0] =1;
            arr[i][i] =1;
            //
            for (int j = 1; j < arr[i].length-1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }



        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
