package com.ocp.day22;

public class MyException {
    public static void main(String[] args) {
        try {
            checkFood("蛋");
        } catch (BadFoodException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
    
    public static void checkFood(String food)throws BadFoodException{
        if(food == "可樂" || food == "薯條" || food == "炸雞"){
            BadFoodException e = new BadFoodException(food);
            throw e;
        }
    }
}
