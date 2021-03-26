package com.ocp.day14;

@FunctionalInterface     // 只能有一個方法
interface BMI{
    double calc(double h , double w);
}


public class Anonymous5 {
    public static void main(String[] args) {
        BMI bmi = (double h , double w) -> w / Math.pow(h/100, 2);
        System.out.printf("%.2f\n" , bmi.calc(170, 60));
        
    }
}


