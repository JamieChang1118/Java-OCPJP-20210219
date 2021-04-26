package com.ocp.day21;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    請撰寫一支程式，需由鍵盤輸入一個整數，用來表示繩子的長度(單位:公尺)
    如果每天減去一半的長度，要花費幾天的時間長度會短於五公尺
    繩子長度有1000與99兩條
*/

public class CutGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入任一整數，若輸入0結束程式: ");
        int rope = 0;
        int count = 0;
        
        try {
            rope = sc.nextInt();            
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤: " + e);
            main(args);
        }
        
        if(rope > 0){
            while (rope >= 5) {                
                count++ ;
                rope /= 2 ;
            }
            System.out.println("count: " + count);
        }
        
    }
}
