package com.lab1;

public class Main2 {
    public static void main(String[] args) {       
        Manager m1 = new Manager(68000);
        m1.setBudget(100000);
        Manager m2 = new Manager(78000);
        m2.setBudget(200000);
        Manager m3 = new Director(88000);
        m3.setBudget(300000);
        
        EmployeeUtil util = new EmployeeUtil();
        System.out.println(util.getAllSalary(m1,m2,m3));
        System.out.println(util.getAllBudget(m1,m2,m3));
        
    }
}
