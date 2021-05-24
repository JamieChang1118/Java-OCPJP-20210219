package com.ocp.day30;

import java.util.stream.IntStream;

public class ParallelExample12 {
    public static void main(String[] args) {
        System.out.println("Normal");
        IntStream range = IntStream.rangeClosed(1, 10);
        System.out.println(range.isParallel());
        range.forEach(System.out::println);
        
        System.out.println("Parallel");
        IntStream range2 = IntStream.rangeClosed(1, 10).parallel();
        System.out.println(range2.isParallel());
        range2.parallel().forEach(System.out::println);
    }
}
