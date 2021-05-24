package com.ocp.day30;

import java.util.stream.IntStream;

/**
 * Java 8 的平行運算
 *   .sequential() 預設 Normal (單工)
 *   .parallel()  平行 (多工)
 */

public class ParallelExample1 {
    public static void main(String[] args) {
        System.out.println("Normal");
        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(System.out::println);
        
        System.out.println("Parallel");    // 平行
        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(System.out::println);
    }
}
