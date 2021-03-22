package com.ocp.day12;

public class Tank extends Car implements Weopon{

    @Override
    void move() {
        System.out.println("坦克用履帶移動");
    }

    @Override
    public void shoot() {
        System.out.println("坦克發射榴彈");
    }
    
}
