package com.lab.lab1;

public class Main3 {
    public static void main(String[] args) {       
        Director d = new Director(88000);
        d.setBudget(300000);
        d.setStockOptions(1000000);
        EmployeeUtil util = new EmployeeUtil();
        System.out.println(util.getAllSalary(d));
        System.out.println(util.getAllBudget(d));
        System.out.println(util.getAllStockOptions(d));
        
    }
}
