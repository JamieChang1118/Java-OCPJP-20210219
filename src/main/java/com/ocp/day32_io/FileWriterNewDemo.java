package com.ocp.day32_io;

import java.io.FileWriter;

/**
 *
 * @author boddy
 */

public class FileWriterNewDemo {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\ocp\\day32_io\\data.txt";
        
        try(FileWriter fw = new FileWriter(path , true)) {    // 預設是 false : 清空原有資料 ||  true : 保留原有資料並加入新資料
            fw.write("Hello");   // 寫入資料
            System.out.println("寫入成功 !");
        } catch (Exception e) {
        }
    }
}
