package com.ocp.day34_nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author boddy
 */

public class FilesReaderDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\com\\ocp\\day34_nio\\1000 Sales Records.csv");
        
        // 1.Files.newBufferedReader --0.585s
        try(BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines().forEach(System.out::println);
        } catch (Exception e) {
        }
        
        // 2.Files.readAllLines (會得到 List 集合)  --0.626s
        List<String> list = Files.readAllLines(path);
        list.stream().forEach(System.out::println);
        
        // 3.Files.lines (會得到 Stream 串流)  --0.588s
        Files.lines(path).forEach(System.out::println);
    }
}
