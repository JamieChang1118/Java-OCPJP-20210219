package com.ocp.day31;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * ReentrantLock的範例應用:
 *     Vincent與Anita輪流拿五組樂透號碼，但是前一個人要連續五組拿完才能換下一人
 * 
 * @author boddy
 */

public class LottoLock implements Runnable{
    private  String userName;
    // 相當於 static synchronized
    private static final ReentrantLock LOCK = new ReentrantLock();
    
    public LottoLock(String userName) {
        this.userName = userName;
    }
    
    @Override
    public void run() {
        try {
            LOCK.lock();    // 嘗試鎖定
            IntStream.rangeClosed(1, 5).forEach(i -> {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                }
                int number = new Random().nextInt(10);
                System.out.printf("%s 得到第 %d 組號碼: %d, 時間 %s\n", userName , i , number , new Date().toString());
            });
        } catch (Exception e) {
            
        } finally {
            LOCK.unlock();
        }
    }
    
    // 主程式
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new LottoLock("Vincent"));
        service.execute(new LottoLock("Anita"));
        service.shutdown();
    }
}
