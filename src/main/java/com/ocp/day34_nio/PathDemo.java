package com.ocp.day34_nio;


import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Path/Paths 類別－操作路徑
 *    任何檔案皆會被配置在所屬路徑之下，NIO.2的檔案操作是以 Path 起頭。
 * @author boddy
 */

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\boddy\\Documents\\NetBeansProjects\\Java20210219");
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("subpath(0, 2): " + path.subpath(0, 2));
        System.out.println("isAbsolute: " + path.isAbsolute());
        System.out.println("toAbsolutePath: " + path.toAbsolutePath());
        System.out.println("toUri: " + path.toUri());
        
    }
}

