package com.ocp.day24;


public class Report implements Runnable{

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.println(tname + "寫 PPT 報表");
    }
    
}
