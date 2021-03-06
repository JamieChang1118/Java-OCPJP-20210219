package com.ocp.day08;

import java.util.Date;

public class BigData {
    private String data;
    private String author = "交易所";
    private static String version;
    
    // 物件初始區段 (會自動將此區段程式碼配置到所有的建構子內)
    {
        if(new Date().getTime() % 2 == 0){
            data = "盤中資料";
        } else {
            data = "盤後資料";
        }
    }
    
    // 類別變數初始區段
    static {
        if (new Date().getTime() % 2 == 0) {
            version = "1.0";
        } else {
            version = "2.0";
        }
    }
    

    @Override
    public String toString() {
        return "BigData{" + "data=" + data + ", author=" + author + ", version=" + version + '}';
    }
    
    
    
}
