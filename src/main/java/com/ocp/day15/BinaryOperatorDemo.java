package com.ocp.day15;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> salary = (principleSalary , bonus) -> principleSalary + bonus;       
        System.out.println(salary.apply(50000, 15000));
        
        
        Integer[] length = {10,20,30};  // 正方形的邊長
        UnaryOperator<Integer> area = (t) -> t * t;    // UnaryOperator 繼承 Function
        Function<Integer, Integer> area2 = (t) -> t * t;
        Stream.of(length).map(area).forEach(System.out::println);    // map 吃一個 Function，而 UnaryOperator 是一個 Function
    }
}
