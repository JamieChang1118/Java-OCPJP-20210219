package com.ocp.day22;

public class MyException {
    public static void main(String[] args) {
        try {
            checkFood("炸雞");
        } catch (BadFoodException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
    
    public static void checkFood(String food)throws BadFoodException{
        String[] badFoods = {"可樂","薯條","炸雞"};     // 垃圾食物
        for(String bad : badFoods){
            if(food.equals(bad)){
                BadFoodException e = new BadFoodException(food);
                throw e;
            }
        }
        System.out.println(food + " 這不是垃圾食物");
    }
}
