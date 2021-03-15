package com.ocp.day10;

import java.util.stream.IntStream;


public class VarageDemo {
    public static void main(String[] args) {
        // 經過 Compiler Sugar 以下都會是一樣的(時間)
        // A
        if(true){
            System.out.println("Hello Word");
        }
        // B
        System.out.println("Hello Word");
        
        System.out.println(10+20+30);
        System.out.println(60);
        
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        int [] values ={10,20,30,40,50};
        System.out.println(add(values));
        System.out.println(add(10, 20, 30, 40));
        System.out.println(add());
        
    }
    
    // 超載(Overloading)
//    public static int add(int x , int y){
//        return x + y;
//    }
//    
//    public static int add(int x , int y , int z){
//        return x + y + z;
//    }
    
    public static int add(int... values){
        return IntStream.of(values).sum();
    }
}
