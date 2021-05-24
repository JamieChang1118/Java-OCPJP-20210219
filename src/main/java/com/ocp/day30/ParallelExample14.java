package com.ocp.day30;

import java.util.stream.Stream;


public class ParallelExample14 {
    public static void main(String[] args) {
        
        long count = Stream.iterate(0, n -> n + 1)    // 走訪器: 從 0  開始，每次 + 1
                .limit(100)    // 100為最高
                .filter(x -> x % 3 == 0 && x % 5 != 0)
                .peek(x -> System.out.println(x))
                .count();
        System.out.println("count: " + count);
        
    }
}
