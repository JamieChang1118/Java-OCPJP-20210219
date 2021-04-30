package com.ocp.test23;

import com.ocp.day23.Power;
import junit.framework.Assert;
import org.junit.Test;

public class TestPower {
    
    @Test   // 測試W
    public void testW(){
        Power power = new Power();
        int v = 10;
        int a = 100;
        int exp = 1000;
        int act = power.getW(v, a);
        Assert.assertEquals(exp, act);
    }
       
    @Test   // 測試V
    public void testV(){
        Power power = new Power();
        int w = 1000;
        int a = 100;
        int exp = 10;
        int act = power.getV(w, a);
        Assert.assertEquals(exp, act);
    }
    
    @Test   // 測試A
    public void testA(){
        Power power = new Power();
        int w = 1000;
        int v = 10;
        int exp = 100;
        int act = power.getA(w, v);
        Assert.assertEquals(exp, act);
    }
}
