package com.ocp.day29;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/*

  單次性排程
  Executors.newSingleThreadScheduledExecutor()
    表示用單一執行緒來執行排定工作:創建並設定延遲時間，延遲時間到就會開始進行排成
                             後啟用，此方法會返回一個 ScheduledFuture 實例。

*/


public class SchedulerDemo {
    public static void main(String[] args) throws Exception{
        int amount = new Random().nextInt(100000);
        System.out.printf("匯款 $%d 元\n" , amount);
        
        Callable<Integer> callable = () -> amount;
        
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<Integer> future = service.schedule(callable, 3, TimeUnit.SECONDS);
        System.out.printf("得到 $%d 元\n" , future.get());
        
        service.shutdown();
    }
}
