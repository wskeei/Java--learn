package com.cyx.io._char;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 使用字符流将"超用心在线教育"写入磁盘文件中
 */
public class Example1 {

    public static void main(String[] args) {
        File file = new File("F:\\AA\\io.txt");
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        //Writer类实现了AutoCloseable接口，因此可以将Writer类对象的构建方法try后面的()中
        try (Writer writer = new FileWriter(file, true);){
            String text = "超用心在线教育";
//            char[] values = text.toCharArray();
//            for(char c: values){
//                writer.write(c);
//            }
//            writer.write(values);
//            writer.write(values, 1, values.length - 1);
            writer.write(text);
            writer.flush();//强制将通道中的数据写入文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
