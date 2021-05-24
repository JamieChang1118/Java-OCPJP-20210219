package com.ocp.day32_io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author boddy
 */

public class FileReaderDemo {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\ocp\\day32_io\\data.txt";
        FileReader fr = null;
        
        try {
            fr = new FileReader(path);
            // code here ...
            char[] buffer = new char[1];
//            int a = fr.read(buffer);
//            System.out.println(a);
//            System.out.println(Arrays.toString(buffer));
//            int b = fr.read(buffer);
//            System.out.println(b);
//            System.out.println(Arrays.toString(buffer));
//            int c = fr.read(buffer);
//            System.out.println(c);
//            System.out.println(Arrays.toString(buffer));
            while (fr.read(buffer) != -1) {                
                System.out.print(buffer[0]);
            }

          
        } catch (IOException e1) {
            System.out.println(e1);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e2) {
                    System.out.println(e2);
                }
            }
        }
        
        
        
    }
}
