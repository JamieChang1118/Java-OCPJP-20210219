package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Lotto539 {
    // 樂透 539 電腦選號(1-39 取 5 個不重複的數字)
    public static void main(String[] args) {
        Set<Integer> lotto = new LinkedHashSet<>();
        Random r = new Random();
        while (lotto.size() < 5) {            
            int n = r.nextInt(39)+1;
            //System.out.printf("n = %d\n" , n);
            lotto.add(n);
        }
        System.out.println(lotto);
        
        
    }
}
