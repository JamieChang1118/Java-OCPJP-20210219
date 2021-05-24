package com.ocp.day31;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * 考題範例
 * @author boddy
 */
public class TestExample2 implements Runnable{
    private static AtomicInteger count = new AtomicInteger(0);
    
    @Override
    public void run() {
        int x = count.incrementAndGet();
        System.out.println(x + " ");
    }
    
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TestExample2());
        Thread thread2 = new Thread(new TestExample2());
        Thread thread3 = new Thread(new TestExample2());
        
        Thread[] ta = {thread1,thread2,thread3};
        for (int x = 0; x < 3; x++) {
            ta[x].start();
        }
        
        // 結果顯示: The program prints 123 and the order is unpredictable.
    }

    
}
