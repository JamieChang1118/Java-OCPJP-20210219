package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class SortedDemo2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 40 ,80, 30 ,90);
        // 將排序好的資料放入集合中
        // 不變更原始資料
        List<Integer> sortedAndPassList = list.stream().filter(s -> s >= 60)
                //.sorted()    // 自然排序
                //.sorted(Comparator.naturalOrder())    // 自然排序
                //.sorted(Comparator.reverseOrder())    // 反向排序
                //.sorted((o1 , o2) -> o1.compareTo(o2))  // 自定義排序1
                .sorted((o1 , o2) -> o1 - o2)    // 自定義排序2
                .collect(toList());
        System.out.println(sortedAndPassList);
        System.out.println(list);
    }
}
