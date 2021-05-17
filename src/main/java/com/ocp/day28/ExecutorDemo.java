package com.ocp.day28;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;

/*
  分離執行緒
    使用Executor的好處：
    1.撰寫直覺調用容易
    2.主程式降低混用.start()與.run()的風險
*/


class MyExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
    
}


public class ExecutorDemo {
    public static void main(String[] args) {
        
        Runnable r1 = () -> System.out.println(new Date());
        Runnable r2 = () -> System.out.println(new Random().nextInt(100));
        
        Executor exec = new MyExecutor();
        exec.execute(r1);
        exec.execute(r2);
        
        // Java8 的寫法，不用建立上面的 Class
        Executor exec2 = (command) -> new Thread(command).start();
        exec2.execute(r1);
        exec2.execute(r2);
        exec2.execute( () -> System.out.println("停電了") );
        
    }
}
