package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class GroupingDemo3 {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("apple", 10, 9.9),
                new Fruit("banana", 20, 19.9),
                new Fruit("orange", 10, 29.9),
                new Fruit("watermelon", 10, 29.9),
                new Fruit("papaya", 20, 9.9),
                new Fruit("apple", 10, 9.9),
                new Fruit("banana", 10, 19.9),
                new Fruit("apple", 20, 9.9)       
        );
        
        // 根據 price 來分組
        Map<Double , List<Fruit>> result = fruits.stream().collect(Collectors.groupingBy(Fruit::getPrice));
        System.out.println(result);
        
        //相同的 price 是哪些水果名
        Map<Double , List<String>> result2 = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getPrice , Collectors.mapping(Fruit::getName, toList())));
        System.out.println(result2);
        
        Map<Double , Set<String>> result3 = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getPrice , Collectors.mapping(Fruit::getName, toSet())));
        System.out.println(result3);
    }
}
