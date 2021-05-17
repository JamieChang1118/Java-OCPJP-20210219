package com.ocp.day28;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/*
   ThreadPoolExecutor (標準執行緒池)

    1.Exectors.newCachedThreadPool()
      表示Runnable可能將執行在新建執行緒或重複利用的執行緒中

    2.Exectors.newFixedThreadPool()
      表示會在執行緒池中建立固定數量的執行緒，並讓Runnable或Callable來運行。

*/

class Lotto implements Callable<Integer>{    // Callable 要抓執行緒的回傳值，所以會需要等待
                                             // Runnable 則是 void : 範例請見 ThreadPoolExecutorDemo2

    @Override
    public Integer call() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        int num = new Random().nextInt(100);
        //System.out.println(num);
        return num;
    }
    
}


public class ThreadPoolExecutorDemo {
    public static void main(String[] args) throws Exception{
        System.out.println("請給我一個樂透數字:");
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 1; i <= 3; i++) {
            System.out.printf("第 %d 組 計算中...\n" , i);
            Future future = service.submit(new Lotto());
            System.out.println(future.get());
        }
        System.out.println(Thread.activeCount());    // 用了幾條執行緒
        
        service.shutdown();   // 執行完任務後會停止
    }
}
