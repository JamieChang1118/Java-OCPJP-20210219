package com.ocp.day21;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    不讓 finally 執行的兩個方法
    1. 在 finally 區段前寫入 System.exit()
    2. 關機
*/

public class CircleComputer {
    static int count = 0;
    public static void main(String[] args) {
        if(count >= 3){
            System.out.println("您錯誤的次數過多!!!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入半徑: ");
        
        try {          
            double r = sc.nextDouble();
            double area = Math.pow(r, 2) * Math.PI;
            System.out.printf("area: %.2f\n" , area);
            //return;
        } catch (InputMismatchException e) {
            count++ ;
            System.out.println("輸入錯誤 , 錯誤次數: " + count);
            System.out.println("錯誤原因: " + e);
            System.out.println("請重新輸入");
            // 再呼叫一次
            main(args);
            //return;
        } finally {
            count++ ;   // 即使 try...catch 裡面有 return 還是會實施 finally 區段
        }
    }
}
