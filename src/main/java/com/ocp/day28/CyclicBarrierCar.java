package com.ocp.day28;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierCar {
    public static void main(String[] args) {
        int n = 4;   //  表示有4台車，必須4台都先到台中，台一起出發往高雄
                    // 如果設成2，則是兩兩成行，然後再往高雄出發
                    // 如果設成3，則有一個落單，則必須設定最高等待時間，否則會持續一直等
        //CyclicBarrier cb = new CyclicBarrier(n);
        
        Runnable r = () -> {
            String tname = Thread.currentThread().getName();
            System.out.printf("%s 喊開動，吃飯!!!\n" , tname);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        };
        CyclicBarrier cb = new CyclicBarrier(n , r);
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();

    }
}
