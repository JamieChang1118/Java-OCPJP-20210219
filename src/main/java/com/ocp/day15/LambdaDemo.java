package com.ocp.day15;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        Integer[] radius ={5,-10,15};
        Supplier<Double> pi = () -> Math.PI;
        Stream.of(radius).filter(t -> t > 0)  // Predicate
                .mapToDouble(t -> t * t * pi.get())   // DoubleFunction
                .forEach(System.out::println);    // Consumer
        
    }
}
