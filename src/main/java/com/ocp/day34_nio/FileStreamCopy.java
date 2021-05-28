/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day34_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author boddy
 */
public class FileStreamCopy {
    public static void main(String[] args) {
        String o_url = "src\\main\\java\\com\\ocp\\day33_io\\car.jpg";     // 來源端
        String d_url = "src\\main\\java\\com\\ocp\\day34_nio\\car.jpg";    // 目的端
        Path source = Paths.get(o_url);
        Path dest = Paths.get(d_url);
        try {
            Files.copy(source, dest , StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copy OK");
            //Files.delete(source);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
