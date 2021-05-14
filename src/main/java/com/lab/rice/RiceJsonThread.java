package com.lab.rice;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class RiceJsonThread implements Callable<String>{
    private String path;

    public RiceJsonThread(String path) {
        this.path = path;
    }

    
    @Override
    public String call() throws Exception {
        URL url = new URL(path);
//        String json = new Scanner(new InputStreamReader(url.openStream() , "UTF-8"))
//                .useDelimiter("\\A")
//                .next();
        InputStreamReader isr = new InputStreamReader(url.openStream() , "UTF-8");
        String json = new Scanner(isr).useDelimiter("\\A").next();
        return json;
    }
}
