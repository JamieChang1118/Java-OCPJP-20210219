package com.ocp.day14;

interface Sub {
    int calc(int x , int y);
}


class SubImpl implements Sub {

    @Override
    public int calc(int x, int y) {
        return x - y;
    }
    
}

public class Anonymous4 {
    public static void main(String[] args) {
        Sub sub1 = new SubImpl();
        System.out.println(sub1.calc(10, 20));
        
        Sub sub2 = new Sub() {
            @Override
            public int calc(int x, int y) {
                return x - y;
            }
        };
        System.out.println(sub2.calc(10, 20));
        // Java 8 Lambda
        Sub sub3 = (int x , int y) -> {return x - y ;};  // 如有兩行以上不省略
        Sub sub4 = (int x , int y) -> x - y;    // 省去 return
        Sub sub5 = (x , y) -> x - y;    // 超精簡寫法
        
        System.out.println(sub5.calc(10, 20));
        
    }
}


