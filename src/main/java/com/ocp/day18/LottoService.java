package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoService {
    static Random r = new Random();
    public static Set<String> get539(){
        //Set<Integer> lotto = new LinkedHashSet<>();
        Set<String> lotto2 = new LinkedHashSet<>();
        while(lotto2.size() < 5){
            int n = r.nextInt(39)+1;
            String pattern = "%02d";
            String str = String.format(pattern, n);
            lotto2.add(str);
        }       
        return lotto2;
    }
    
    public static List<String> get4Stars(){
        //List<Integer> lotto = new ArrayList<>();
        List<String> lotto2 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {           
            int n = r.nextInt(10);
            String pattern = "%02d";
            String str = String.format(pattern, n);
            lotto2.add(str);
        }
        return lotto2;
    }
}
