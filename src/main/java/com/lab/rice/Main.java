package com.lab.rice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Rice[] rices = Util.getGoodRice();
        Rice[] rices2 = Util.getBadRices();
        List<Rice> list = new ArrayList(Arrays.asList(rices));
        list.addAll(Arrays.asList(rices2));
        
        list.stream().filter(r -> r.get品名().contains("冠軍")).forEach(System.out::println);
        
//        Stream.of(rices)
//                .filter(r -> r.get檢驗結果().contains("不合格"))
//                .forEach(System.out::println);
     
    }
}
