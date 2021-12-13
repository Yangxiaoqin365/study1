package com.it.yxq.arr数组;

//冒泡排序实现
public class PaiXuArr {


    public static void main(String[] args) {

        int[] arr ={2,6,1,3,99,23,75,33};

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp= arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j] =temp;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
