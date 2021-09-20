package com.multithreading.data;

import java.io.File;

public class PathManager {

    private static final String RESOURCE_PATH = "src/main/resources";

    /**
     * @param fileName it's name file with resource catalog
     * @return string resource and file name
     */
    public String createAbsoluteResourceFilePath(String fileName){
        File file = new File(RESOURCE_PATH);
        String absolutePath = file.getAbsolutePath();
        return absolutePath + "/" + fileName;
    }
}
