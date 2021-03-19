package com.lab1;

import java.util.Random;
import java.util.stream.Stream;


// 員工管理工具
public class EmployeeUtil {
    // 取得所有員工的薪資
    public int getAllSalary(Employee... employees){
    // Java 8
    //return Stream.of(employees).mapToInt(e -> e.getSalary()).sum();
    return Stream.of(employees).mapToInt(Employee::getSalary).sum();   
    }
    
    // 取得所有經理的預算(Budget)
    public int getAllBudget(Manager... managers){
    return Stream.of(managers).mapToInt(Manager::getBudget).sum();   
    }
    
    // 取得所有董事的股票選擇權
    public int getAllStockOptions(Director... directors){
    return Stream.of(directors).mapToInt(Director::getStockOptions).sum();   
    }
    
    // 公差一員
    public Employee getRandomEmployee(){
        int n = new Random().nextInt(3);    // 0 , 1 , 2
        switch(n){
            case 0:
                return new Employee(38000);
            case 1:
                Manager m = new Manager(68000);
                m.setBudget(100000);
                return m;
            default:
                Director d = new Director(88000);
                d.setBudget(500000);
                d.setStockOptions(1000000);
                return d;
        }
    }
    
}
