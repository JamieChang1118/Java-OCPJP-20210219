package com.ocp.day02;

// Data class
// 物件 = 實體、實例、instance
public class Student {
    // 類別屬性
    // static : 類別的、靜態的
    public static String schoolName;
    // 物件屬性
    // 屬性、變數、資產、欄位
    public String name;
    public int age;
    
    // 方法
    // 印出學生資料
    public void print(){
        System.out.printf("%s %s %d\n" , schoolName , name , age);
    }
}
