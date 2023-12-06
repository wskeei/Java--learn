package com.cyx.file;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件列表
 */
public class Example4 {

    public static void main(String[] args) {
        File directory = new File("F:\\study\\java");
        //列出文件夹中所有文件
        File[] files = directory.listFiles();
        //需要做非空判断，因为目录可能是非法的，也就是可能不存在
        if(files != null){
//            for(int i=0; i<files.length; i++){
//                File file = files[i];
//            }
//            for(File file: files){//增强for循环
//                System.out.println(file.getPath());
//            }
        }


        File folder = new File("F:\\Idea\\IntelliJ IDEA 2020.1\\bin");
//        class A implements FileFilter{
//
//            @Override
//            public boolean accept(File pathname) {
//                return false;
//            }
//        }
        //匿名内部类 => 相当于将类的名字隐藏起来
        FileFilter filter = new FileFilter() {
            //表示接受文件的条件
            @Override
            public boolean accept(File file) {
                String name = file.getName();//获取文件名，也包含后缀在内
                //返回文件名是否以.ext结尾
                return name.endsWith(".exe"); //startsWith("hello") 检测字符串是否以hello开始
            }
        };
        File[] childFiles = folder.listFiles(filter);
        if(childFiles != null){
            for(File file: childFiles){
                System.out.println(file.getPath());
            }
        }
    }
}
