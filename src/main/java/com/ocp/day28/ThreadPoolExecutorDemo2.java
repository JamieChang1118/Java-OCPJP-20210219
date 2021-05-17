package com.ocp.day28;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;



class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("普通任務");
    }
    
}


class LongTask implements Runnable{

    @Override
    public void run() {
        System.out.println("長任務 : 開始");
        try {
            TimeUnit.SECONDS.sleep(5);    // 等於 Thread.sleep(5000)
        } catch (Exception e) {
        }
        System.out.println("長任務 : 結束");
    }
    
}


public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newCachedThreadPool();
//        Future future = service.submit(new LongTask());
//        System.out.println(future.get());   // 結果是null
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new Task());
        System.out.println("任務配置完畢");
        
        // shutdown() 可配合偵測是否還有工作在進行，多久偵測一次
        // 平滑關閉
        service.shutdown();
        
        // 偵測是否還有工作再執行
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {            
            System.out.println("還有工作再進行...");
        }
        System.out.println("任務配置停止");
   
    }
}
