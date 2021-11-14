package com.it.yxq.reflex;

import lombok.Data;

/**
 * @author 杨晓钦
 * @since 2021/11/11 15:34
 */
@Data
public class Apple {
    private String name;
    private int price;

    public Apple(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Apple() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
