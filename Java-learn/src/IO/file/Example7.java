package com.cyx.file;

import java.io.File;

/**
 * 使用递归打印文件夹所有文件信息
 */
public class Example7 {

    public static void main(String[] args) {
//        File folder = new File("F:\\study");
//        recursiveFolder(folder);
        File directory = new File("F:\\test");
        deleteFolder(directory);
    }
    //递归遍历文件夹
    public static void recursiveFolder(File folder){
        if(folder.isDirectory()){//检测是否是文件夹
            File[] files = folder.listFiles();
            if(files != null){
                for(File file: files){
                    if(file.isDirectory()){//如果是文件夹，就再调用方法进行查看
                        recursiveFolder(file);
                    } else {
                        System.out.println(file.getPath());
                    }
                }
            }
        } else {//不是文件夹就直接打印文件的路径
            System.out.println(folder.getPath());
        }
    }

    public static void deleteFolder(File folder){
        if(folder.isDirectory()){//是文件夹就需要再进去看
            File[] files = folder.listFiles();
            if(files != null){
                for(File file: files){
                    if(file.isDirectory()){
                        deleteFolder(file);
                    } else {
                        file.delete();
                    }
                }
                folder.delete();//文件夹中文件删除完毕之后，文件夹也需要删除掉
            }
        } else {//不是文件夹，直接删除
            folder.delete();
        }
    }
}
