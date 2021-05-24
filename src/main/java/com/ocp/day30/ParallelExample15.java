package com.ocp.day30;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
  平行運算出結果: 16.634 s
  單工運算出結果: 1.03 m
*/

public class ParallelExample15 {
    public static void main(String[] args) {
        long count = Stream.iterate(0, n -> n + 1).limit(1000000)
                .parallel()
                .filter(ParallelExample15::isPrime)               
                .count();
        System.out.println("count: " + count);
        
    }
    
    
    public static boolean isPrime(int x){
        if(x <= 1) return false;       
        return !IntStream.rangeClosed(2, x/2).anyMatch(i -> x % i == 0);
    }
    
      
}
