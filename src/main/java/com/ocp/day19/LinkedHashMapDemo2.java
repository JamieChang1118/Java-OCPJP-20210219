package com.ocp.day19;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("數學", 90);
        exams.put("英文", 80);
        
        // 求總分
        int sum = exams.values().stream().mapToInt(n -> n.intValue()).sum();
        System.out.println("總分: " + sum);
        int sum2 = exams.entrySet().stream().mapToInt(n -> n.getValue()).sum();
        System.out.println("總分: " + sum2);
        
        
    }
}
