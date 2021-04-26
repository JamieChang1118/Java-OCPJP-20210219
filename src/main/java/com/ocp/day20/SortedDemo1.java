package com.ocp.day20;

/*
符合 @FunctionInterface(只定义了唯一的抽象方法)
1. 自定義的物件方法
2. static 方法不算在內
3. default 方法不算在內
4. Object 方法不算在內
*/


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedDemo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100,80,90);
        System.out.println(list);
        // 排序(自然排序: 小 -> 大)
        Collections.sort(list);
        System.out.println(list);
        // 排序(大 -> 小)
        Collections.sort(list , new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);
        
        // 排序 (小 -> 大)
        Collections.sort(list , (o1 , o2) -> o1 - o2);
        System.out.println(list);
    }
}
