package com.it.yxq.可变参;

public class Demo {

//  可变参

    /**
     * 使用方式： 参数类型...参数名
     * @param args
     */
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.str("d","");
    }

    public void str(String... str){

        System.out.printf("-----");
    }

    public void str(String str){
        System.out.println("str");
    }

}
