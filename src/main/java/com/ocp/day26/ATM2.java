package com.ocp.day26;


public class ATM2 {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Thread t1 = new WithdrawThread(account, 5000);
        t1.setName("小明");
        t1.start();
        
        Thread t2 = new WithdrawThread(account, 4000);
        t2.setName("小華");
        t2.start();
        
        Thread t3 = new WithdrawThread(account, 3000);
        t3.setName("小英");
        t3.start();

    }
}
