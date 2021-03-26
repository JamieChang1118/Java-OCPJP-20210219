package com.ocp.day14;

interface Salary{
    int amount();
}


public class Anonymous {
    public static void main(String[] args) {
        // 匿名類別
        Salary salary = new Salary() {
            @Override
            public int amount() {
                return 50000;
            }
        };       
        Salary salary2 = new Salary() {
            @Override
            public int amount() {
                return 80000;
            }
        };
        
        System.out.println(salary.amount());
        System.out.println(salary2.amount());
        
    }
}


