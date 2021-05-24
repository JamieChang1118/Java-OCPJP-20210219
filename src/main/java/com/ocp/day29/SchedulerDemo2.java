package com.ocp.day29;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/*
  重複性排程
  scheduleWithFixedDelay():
        下一次工作起點時間 = 基本延遲時間 + 上一次工作完成時間。
  
*/

public class SchedulerDemo2 {
    public static void main(String[] args) throws Exception{
        Runnable r = () -> {
            int delay = new Random().nextInt(3000);
            try {
                Thread.sleep(delay);              
            } catch (Exception e) {
            }
            int n = new Random().nextInt(9)+1;
            System.out.printf("開獎號碼 : %d, 花費時間 : %.1f , 開獎時間: %s\n" , n , delay/1000.0 , new Date());
        };
        
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        int initDelay = 5;     // 停5秒後才開始執行
        int delay = 3;    // 每隔3秒鐘開獎一次
        service.scheduleWithFixedDelay(r, initDelay, delay, TimeUnit.SECONDS);
    }
}
