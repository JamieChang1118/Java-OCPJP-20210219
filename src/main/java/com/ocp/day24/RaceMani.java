package com.ocp.day24;

public class RaceMani {
    public static void main(String[] args) {
        Race race = new Race();
        Race race2 = new Race();
        Race race3 = new Race();
        
        // 單工:跑完一次再跑一次
        //race.job();
        //race2.job();
        
        // 設定執行緒名稱
        race.setName("烏龜");
        race2.setName("兔子");
        race3.setName("程咬金");  // 半路殺出來的 200-600可看到
        
        // 設定權限(預設=5 , 範圍:1-10)
        race.setPriority(10);
        race2.setPriority(1);
        
        // 分時多工:執行緒啟動
        race.start();
        race2.start();
        race3.start();
    }
}
