package com.ocp.day33_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 網路抓取圖片範例
 * @author boddy
 */

public class WebimageIO {
    public static void main(String[] args) throws MalformedURLException {
        String path = "https://akm-img-a-in.tosshub.com/sites/btmt/images/stories/lamborghini_660_140220101539.jpg";    // 抓取照片的網址
        String filePath = "src\\main\\java\\com\\ocp\\day33_io\\car.jpg";   // 存放相片的路徑
        URL url = new URL(path);
        
        // 因為來源是圖片，所以可以用 FileOutputStream
        try(InputStream is = url.openStream();
            FileOutputStream fos = new FileOutputStream(filePath);){
            
            byte[] buffer = new byte[1];
            while (is.read(buffer) != -1) {                
                fos.write(buffer);               
            }
            System.out.println("寫檔完成");        
        } catch (IOException ex) {
            
        }
    }
}
