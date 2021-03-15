package com.ocp.day10;


class Bar{

    Bar() {
        System.out.println("A");
    }
    Bar(int x){
        this();
        System.out.println("B");
    }
    
    
}


class Foo extends Bar{

    Foo() {
        this(10);   // 呼叫自己的建構子
        System.out.println("C");
    }
    
    Foo(int x){
        super(20);  // 呼叫父類的建構子
        System.out.println("D");
    }
}


public class ExamDemo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        // 印出 A B D C
    }
}
