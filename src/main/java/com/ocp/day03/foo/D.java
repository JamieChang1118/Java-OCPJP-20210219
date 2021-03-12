package com.ocp.day03.foo;

import com.ocp.day03.bar.A;

public class D {
    void i_want_money(){
        A a = new A();
        // 因為 money 的存取權限是 protected 需透過 extends 才能存取
        // 所以 D 無法存取
        // System.out.println(a.money);
    }
}
