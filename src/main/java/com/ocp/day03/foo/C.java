package com.ocp.day03.foo;

import com.ocp.day03.bar.A;

public class C extends A{
    void i_want_money(){
        // A a = new A();
        // 因為 money 的存取權限是 protected 所以 C 能存取
        System.out.println(money);
    }
}