package com.ocp.day24;

public class MaryMain{
    public static void main(String[] args) {
        Runnable job1 = new Programming();
        Runnable job2 = new Report();
        Thread mary = new Thread(job1, "Mary");
        mary.start();
        
        // 課外補充:如果有很多任務可以做成陣列
        Runnable[] runnables = {job1,job2};
        Runnable job3 = new Jobs(runnables);
        Thread helen = new Thread(job3, "Helen");
        helen.start();
        
    }
}
