package com.ocp.day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 全班6人此次考數學的成績列表
        int[] scores1 = {81,90,90,100,40,50};
        System.out.printf("數學: %s\n" , Arrays.toString(scores1));
        
        // 找出最高分和最低分 Java7
        int max = 0;
        for(int x : scores1){
           if(x > max){
               max = x;
           } 
        }
        System.out.printf("最高分: %d\n" , max);
        
        // 最低分 Java7
        int min = max;
        for (int x : scores1) {
            if(x < min){
                min = x;
            }
        }
        System.out.printf("最低分: %d\n" , min);
        
        
        // 找出最高分和最低分 Java8
        max = IntStream.of(scores1).max().getAsInt();
        System.out.printf("最高分: %d\n" , max);
        min = IntStream.of(scores1).min().getAsInt();
        System.out.printf("最低分: %d\n" , min);
        
        // Java 8 統計物件       
        IntSummaryStatistics stat = IntStream.of(scores1).summaryStatistics();
        System.out.println(stat);
        System.out.println(stat.getAverage());
        
    }
}
