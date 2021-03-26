package com.ocp.day13;

public interface Animal {
    void move();
    // Java 8 : 介面預設方法實作
    default void eat(){
        System.out.println("吃罐頭");
    }
}
