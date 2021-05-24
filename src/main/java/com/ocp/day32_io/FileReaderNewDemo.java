package com.ocp.day32_io;

import java.io.FileReader;
import java.io.IOException;


/**
 * 利用 try-with-resource
 * @author boddy
 */

public class FileReaderNewDemo {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\ocp\\day32_io\\data.txt";
        
        try(FileReader fr = new FileReader(path)) {
            char[] buffer = new char[1];
            while (fr.read(buffer) != -1) {                
                System.out.println(buffer[0]);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
