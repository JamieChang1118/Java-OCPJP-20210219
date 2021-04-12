package com.ocp.day16;

import java.util.function.DoubleUnaryOperator;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;


public class PersonMain2 {
    public static void main(String[] args) {
        Person[][] people = {
            {   // A班
                new Person("John", 170.0, 60.0),
                new Person("Mary", 150.0, 50.0),
                new Person("Helen", 165.0, 80.0)
            },
            {   // B班
                new Person("Bob", 180.0, 80.0),
                new Person("Jo", 168.0, 58.0),           
            }        
        };    // 代表我有2班的學生 A 班、B班
        
        // 請列印出此5人的BMI資料
        ToDoubleFunction<Person> getBmi = p -> p.getW() / Math.pow(p.getH()/100, 2);    // 計算 BMI
        DoubleUnaryOperator fbmi = bmi -> Math.round(bmi * 100)/ 100.0;     // 取小數兩位、四捨五入
        Stream.of(people)
                .flatMap(p -> Stream.of(p))
                .mapToDouble(getBmi)
                .map(fbmi)
                .forEach(System.out::println);
    }
}
