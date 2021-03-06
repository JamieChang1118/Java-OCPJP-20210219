package com.ocp.day34_nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/*
    在 source 資料夾下所做的動作會被記錄下來
*/

public class WatchSourceFolder {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/com/ocp/day34_nio/source");
        WatchService ws = FileSystems.getDefault().newWatchService();
        path.register(ws, 
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);
        
        while (true) {            
            System.out.println("Watch...");
            WatchKey key = ws.take();
            for(WatchEvent event : key.pollEvents()) {
                System.out.printf("事件: %s, 資源: %s\n",
                        event.kind().name(),
                        event.context().toString());
            }
            key.reset();
        }
    }
}
