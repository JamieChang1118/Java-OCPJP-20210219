package com.ocp.day19;

import java.util.Iterator;
import java.util.Vector;

// 先開一個固定的量，不夠會再開(會是原長度的2倍)
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(641,10);   // 可以指定要的 capacity ，例如: new Vector<>(128,10)
        for (int i = 0; i < 641; i++) {
            v.add(i);
        }
        v.add(100);
        System.out.println("size: " + v.size());
        System.out.println("capacity: " + v.capacity());
        
        // 刪除偶數資料
        Iterator<Integer> iter = v.iterator();
        while (iter.hasNext()) {
            if(iter.next() % 2 == 0){
                iter.remove();
            }           
        }
        System.out.println("size: " + v.size());
        System.out.println("capacity: " + v.capacity());
        
    }
    
    
}
