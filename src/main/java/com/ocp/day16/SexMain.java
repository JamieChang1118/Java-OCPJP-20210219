package com.ocp.day16;

public class SexMain {
    public static void main(String[] args) {
        //chechSex(1);    不能再寫1、2、3
        chechSex(Sex.man);
        chechSex(Sex.female);
    }
    
    public static void chechSex(Sex sex){
        switch(sex){
            case man:
                System.out.println("我是男生");
                break;
            case female:
                System.out.println("我是女生");
                break;
        }
    }
}
