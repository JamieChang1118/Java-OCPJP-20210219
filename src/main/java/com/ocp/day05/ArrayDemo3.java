package com.ocp.day05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 全班6人此次考數學的成績列表
        int[] scores1 = {81,90,90,100,40,50};
        System.out.printf("數學: %s\n" , Arrays.toString(scores1));
        int sum = IntStream.of(scores1).sum();
        double avg = IntStream.of(scores1).average().getAsDouble();
        System.out.printf("總分: %d\n" , sum);
        System.out.printf("平均: %.1f\n" , avg);
        
        // 請問及格的總分與平均
        sum = IntStream.of(scores1).filter(s -> s >= 60).sum();
        System.out.printf("及格總分: %d\n" , sum);
        avg = IntStream.of(scores1).filter(s -> s >=60).average().getAsDouble();
        System.out.printf("及格平均: %.1f\n" , avg);
               
        // Java 8 計算總和
        int sum2 = 0;
        sum2 = Arrays.stream(scores1).sum();
        System.out.printf("總分: %d\n" , sum2);
        
        // Java8 計算平均
        double avg2 = 0;
        avg2 = Arrays.stream(scores1).average().getAsDouble();
        System.out.printf("平均: %.1f\n" , avg2);
        
        // Java 7
        sum = 0;
        for(int x : scores1) {
            if(x >= 60) {
                sum += x;
            }
        }
        System.out.printf("及格的總分: %d\n", sum);
                
    }
}
