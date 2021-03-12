package com.ocp.day04;

import java.util.Scanner;

public class ATMSystem {
    private Account account = new Account();
    
    // 人機介面
    public void menu(){
        System.out.println("-------------------");
        System.out.println("1. 提款");
        System.out.println("2. 存款");
        System.out.println("3. 查詢");
        System.out.println("0. 離開");
        System.out.println("-------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("請選擇: ");
        int n = sc.nextInt();
        service(n);
    }
    
    // 功能服務 (service 對 account 做操作)
    public void service(int n) {
        Scanner sc = new Scanner(System.in);
        switch(n){
            case 1:
                System.out.print("請輸入提款金額: ");
                int withdrawalMoney = sc.nextInt();
                account.withdrawal(withdrawalMoney);
                break;
            case 2:
                System.out.print("請輸入存款金額: ");
                int depositMoney = sc.nextInt();
                account.deposit(depositMoney);
                break;
            case 3:
                account.printMoney();
                break;
            case 0:
                System.exit(0);  // 強制離開系統
        }
    }
    
    public static void main(String[] args) {
        ATMSystem atm = new ATMSystem();
        while(true){
            atm.menu();
            System.out.println("按下 enter 後繼續");
            new Scanner(System.in).nextLine();
        }       
    }
    
}
