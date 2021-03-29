/*
1.Consumer: 接受一個引數，然後處理後不傳回值
2.Function: 接受一個引數，然後以該引數進行計算後傳回任意結果
3.Predicate: 接受一個引數，然後只傳回 boolean 值
4.Supplier: 不接受任何引數，然後傳回值
*/

package com.ocp.day15;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Integer[] radius = {10,-5,15};
        Consumer<Integer> consumer = (t) -> System.out.println(t);
        Consumer<Integer> consumer2 = (t) -> System.out.println(t + ", ");
        Consumer<Integer> consumer3 = System.out::print;
        //print(radius, (r) -> System.out.println(r));
        print(radius, consumer);
        
    }
    
    public static void print(Integer [] radius , Consumer<Integer> consumer){
        for(Integer r : radius){
            consumer.accept(r);
        }
    }
}
