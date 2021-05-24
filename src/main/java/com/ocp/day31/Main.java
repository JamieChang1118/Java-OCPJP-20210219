package com.ocp.day31;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;



public class Main {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("蘋果","蘋果","香蕉","蘋果","柳丁","香蕉","椰子");
        
        String[] fruits = items.stream().toArray(String[]::new);
        
        System.out.println(
                Stream.of(fruits)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet()
                        .stream()
                        .collect(Collectors.groupingBy(Entry::getValue, Collectors.mapping(Entry::getKey, toSet())))
        );
       
    }
}
