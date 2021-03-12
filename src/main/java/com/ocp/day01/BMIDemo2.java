package com.ocp.day01;

public class BMIDemo2 {
    public static void main(String[] args) {
        printBMI("John" , 170 , 60);
        printBMI("Mary" , 160 , 48);
        printBMI("Helen" , 166 , 65);
    }
    
    public static void printBMI(String name, double height , double weight) {  
        double result = weight / Math.pow(height/100, 2);
        System.out.printf("%s 的身高: %.1f 體重: %.1f bmi: %.2f\n" , name , height , weight , result);
        
    }
}
