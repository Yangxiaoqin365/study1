package com.it.yxq.对象传参;

public class PassObject {

    public static void main(String[] args) {
        int time =5;
        PassObject passObject=new PassObject();
        Circle c=new Circle();
        passObject.printAreas(c,5);
        System.out.println(c.getRedius());
    }
    public static  void printAreas(Circle c,Integer time){

        for (int i = 1; i <= time; i++) {
            c.setRedius(i);
            c.redius=i;
            double redius = c.findArea(c.getRedius());
            System.out.print(c.getRedius());
            System.out.println("   "+redius);
        }

        c.setRedius(time+1);
    }
}
