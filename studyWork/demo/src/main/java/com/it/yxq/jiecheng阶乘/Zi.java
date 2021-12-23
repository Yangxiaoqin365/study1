package com.it.yxq.jiecheng阶乘;

/**
 * @author 杨晓钦
 * @since 2021/12/17 16:39
 */
public class Zi extends Person{
    private String name;

    public Zi() {
        System.out.println("Zi");
    }

    public Zi(String name) {
        System.out.println("Zi1");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
