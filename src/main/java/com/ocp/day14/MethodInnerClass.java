package com.ocp.day14;

public class MethodInnerClass {
    
    
    void foo(){
        int y = 2;  // 這個 y 是 final
        
        class Hello {
            void print(){
                System.out.println(y);
            }
        }
    }
    
}
