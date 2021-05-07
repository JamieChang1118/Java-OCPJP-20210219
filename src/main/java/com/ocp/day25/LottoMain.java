package com.ocp.day25;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class LottoMain {
    public static void main(String[] args) {
        // Callable 需要 FutureTask 來包裝，也就是 Callable 的容器
        FutureTask<Integer> task = new FutureTask<>(new Lotto());
        new Thread(task).start();
        System.out.println("計算中...");
        // 取到值後才會結束
        try {
            System.out.println(task.get());
        } catch (InterruptedException ex) {
            
        } catch (ExecutionException ex){
            
        }
        System.out.println("程式結束");
        
        
    }
}
