package com.ocp.day25;

import java.util.Random;
import java.util.concurrent.Callable;

/*
    有回傳值的執行緒
*/

public class Lotto implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return new Random().nextInt(100);   // 回傳值
    }
    
}
