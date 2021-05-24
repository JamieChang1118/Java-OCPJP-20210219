package com.ocp.day29;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/*
  重複性排程 
  scheduleAtFixedRate() :
                下一次工作起點時間 = (上一次工作完成時間 < 基本週期時間)則以基本週期時間為準
                                                    or
                                   (上一次工作完成時間 > 基本週期時間)則以上一次工作完成時間為準

    *簡單的說就是在上一次工作完成時間與基本週期時間之間取較大的當成下一次工作的起點時間。

  其中最關鍵的差異為：
    schedule為「fixed-delay」，執行時間參照前次工作執行完成的時間：若執行工作沒被 delay，則按照預訂的時間執行；
        但若執行工作時被 delay了，随後工作的預訂執行時間會按照上一次執行「完成」的時間點來計算。

    scheduleAtFixedRate為「fixed-rate」，執行時間參照一開始的時間點；和schedule一樣，若執行工作沒被 delay，則按照預訂的時間執行；
        但如果執行工作時被delay了，後續的預訂執行時間仍按照上一次執行「開始」的時間點計算，
        且為了「catch up」預訂時間，會連續多次補足未完成的任務！

*/

public class SchedulerDemo3 {
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
        int initDelay = 0;     // 立即開始執行
        int delay = 3;    // 每隔3秒鐘開獎一次
        service.scheduleAtFixedRate(r, initDelay, delay, TimeUnit.SECONDS);
    }
}
