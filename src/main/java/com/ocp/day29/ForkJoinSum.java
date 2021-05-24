package com.ocp.day29;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Fork/Join框架
 * 目的：為求執行效率
 * 實施：Fork/Join 設計模式
    Fork：將任務不斷向下分解(Fork)至最小單位，程式將計算此最小單位的邏輯結果。
    Join ：得到結果後再往上合併(Join)計算至源頭，到了源頭答案也就出來了。

 * 使用ForkJoin設計模式
    1.ForkJoinTask實作了Future介面以取得子任務所回報的計算結果。
      -- RecursiveTask表示需要有返回結果。
      -- RecursiveAction表示不需要有返回結果。
    2.門檻值 THRESHOLD: 根據每台實際執行主機硬體設備不同而不同。

 */

class SumTask extends RecursiveTask<Long>{
    private long [] numbers;
    private int from;    //從哪邊
    private int to;    //到哪邊

    public SumTask(long[] numbers, int from, int to) {
        this.numbers = numbers;
        this.from = from;
        this.to = to;
    }
    
   
    @Override
    protected Long compute() {
        // 當資料數量 <= 3 才會計算
        if(to - from <= 3){
            long total = 0;
            for (int i = from; i < to; i++) {
                total += numbers[i];
            }
            System.out.printf("from: %d, to: %d, total: %d\n" , from , to , total);
            return total;
        } else {    // 將任務一分為二
            int middle = (from + to) / 2;
            System.out.printf("Left from: %d, to: %d\n" , from , middle);
            SumTask taskLeft = new SumTask(numbers, from, middle);
            System.out.printf("Right from: %d, to: %d\n" , middle , to);
            SumTask taskRight = new SumTask(numbers, middle, to);
            taskLeft.fork();    // 拆分
            taskRight.fork();
            return taskLeft.join() + taskRight.join();   // 拆分完要再合併
        }
    }
    
}

public class ForkJoinSum {
    public static void main(String[] args) {
        long[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));
        ForkJoinPool pool = new ForkJoinPool(4);    // 硬體最大的核心數
        int from = 0 , to = numbers.length;
        long result = pool.invoke(new SumTask(numbers, from, to));
        System.out.println(result);
    }
}
