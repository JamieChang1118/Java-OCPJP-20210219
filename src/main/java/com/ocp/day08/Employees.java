package com.ocp.day08;

import java.util.stream.Stream;

public class Employees {
    private String[] employees = {"John" , "Mary" , "Helen"};
    
    private static Employees _instance = new Employees();
    // 1.建立 private 的建構子
    // 2.自己建立一個實例(static Employees 的物件)
    private Employees(){
    
    }
    // 3.提供一個 public static 方法，讓外界得到你建立的唯一物件
    public static Employees getEmployees() {
        return _instance;
    }
    
    public void print(){
        Stream.of(employees).forEach(System.out::println);
    }
    
}
