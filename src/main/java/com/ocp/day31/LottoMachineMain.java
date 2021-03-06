package com.ocp.day31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * invokeAll() : 當所有任務完成時，返回一個 Future 列表，各項任務的執行結果皆被封裝在Future物件內。
 * @author boddy
 */

public class LottoMachineMain {
    public static void main(String[] args) throws Exception {
        System.out.println("準備開獎");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Lotto>> list = new ArrayList<>();
        list.add(new LottoMachine(1));
        list.add(new LottoMachine(2));
        list.add(new LottoMachine(3));
        list.add(new LottoMachine(4));
        list.add(new LottoMachine(5));
        System.out.println("開始搖獎");
        List<Future<Lotto>> results = service.invokeAll(list);    // 等所有獎都搖出來才一次 show 出來
        System.out.println("唱名獎號");
        results.forEach(f -> {
            try {
                    System.out.println(f.get());
            } catch (Exception e) {
            }
        });
        service.shutdown();
        
    }
}
