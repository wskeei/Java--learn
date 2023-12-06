package com.cyx.io._char;

import java.io.*;

public class Example3 {

    public static void main(String[] args) {
        String sourceFile = "F:\\AA\\io.txt";
        String destFile = "F:\\file\\a.txt";
        copyFile(sourceFile, destFile);
    }

    public static void copyFile(String sourceFile, String destFile){
        File file = new File(destFile);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        try (Reader reader = new FileReader(sourceFile);
             Writer writer = new FileWriter(file)){
            char[] buffer = new char[4096];
            while (true){
                int len = reader.read(buffer);
                if(len == -1) break;
                writer.write(buffer, 0, len);
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
