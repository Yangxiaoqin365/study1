package com.it.yxq.jiecheng阶乘;

/**
 * @author 杨晓钦
 * @since 2021/12/17 16:37
 */
public class Person {
    private String name;

    public Person() {
        System.out.println("fu");
    }

    public Person(String name) {
        System.out.println("fu1");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
