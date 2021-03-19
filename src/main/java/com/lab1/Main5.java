package com.lab1;

public class Main5 {
    public static void main(String[] args) {
        // 取得公差一員
        EmployeeUtil util = new EmployeeUtil();
        Employee emp = util.getRandomEmployee();
        System.out.println(emp.getClass().getSimpleName());
    }
}
