package com.ocp.day33_io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 利用資料緩衝區(Buffer)可大量降低檔案操作的次數，以增加程式執行上的效率。
 *  BufferedReader 與 BufferedWriter 是字元導向，讀取資料時不需逐字讀取，可利用readLine()做逐行讀取以提升資料讀取的效率。
 * 
 * @author boddy
 */

public class BigDataBufferReader {
    public static void main(String[] args) {
        String filePath = "src\\main\\java\\com\\ocp\\day33_io\\1000 Sales Records.csv";
        
        try(FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr); ){
            
            String data = null;
            // 逐筆將資料讀取出來
            while ((data = br.readLine()) != null) {
                // 逐行印出
                System.out.println(data);
            }
            
        } catch (Exception e) {
        }
    }
}
