package com.it.yxq.对象传参;

import lombok.Data;
import sun.applet.Main;
@Data
public class Circle {

     double redius;

    public double findArea(double redius){
        return Math.PI*redius;
    }
}
