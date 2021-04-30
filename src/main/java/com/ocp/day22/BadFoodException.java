package com.ocp.day22;

public class BadFoodException extends Exception{

    public BadFoodException(String food) {
        super(food + " 這是垃圾食物");
    }
    
}
