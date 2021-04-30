package com.ocp.day21;

public class AppleShare {
    public static void main(String[] args) {       
        int n = 0;   // n 為人數
        try {
            submit(n);
        } catch (ArithmeticException e) {
            System.out.println("錯誤原因: " + e.getMessage());
            System.out.println("錯誤原因: " + e.getLocalizedMessage());
            System.out.println(e);
        }
        
    }
    
    public static void submit(int n){   // 人數
        if(n <= 0){
            ArithmeticException e = new ArithmeticException("n <= 0");
            throw e;
        }
        int apple = 10;
        int result = 0;
        result = apple / n;
        System.out.println(result);
    }
}
