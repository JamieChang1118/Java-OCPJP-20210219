package com.ocp.day24;

// 1.繼承 Thread 變成子執行緒物件
public class Race extends Thread{
    private void job(){
        // 執行緒名稱
        String tname = Thread.currentThread().getName();
        for (int i = 0; i <= 1000; i++) {
            if(tname.equals("程咬金") && (i < 200 || i > 600))
                continue;
            System.out.printf("%s 跑了 %d 步\n" , tname , i);
                       
        }
    }
    
    // 2. 給它工作 / 任務
    @Override
    public void run(){
        job();
    }
    
}
