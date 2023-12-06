package com.cyx.file;

import java.io.File;
import java.io.IOException;

/**
 * 文件判断
 */
public class Example3 {

    public static void main(String[] args) {
        File file = new File("F:\\record\\stu.txt");
        //判断文件是否可读
        boolean readable = file.canRead();
        System.out.println("文件是否可读：" + readable);
        //判断文件是否可写
        boolean writable = file.canWrite();
        System.out.println("文件是否可写：" + writable);
        //判断文件是否存在
        boolean exists = file.exists();
        System.out.println("文件是否存在：" + exists);
        //判断文件是否是目录
        boolean isDirectory = file.isDirectory();
        System.out.println("文件是否是目录：" + isDirectory);
        File parent = file.getParentFile();
        System.out.println("父级文件是否是目录：" + parent.isDirectory());
        //判断文件是否是隐藏文件
        boolean hidden = file.isHidden();
        System.out.println("文件是否是隐藏文件：" + hidden);
        //判断文件是否可执行
        boolean executable = file.canExecute();
        //所谓的可执行文件，是指双击之后有反应的文件都称之为可执行文件
        System.out.println("文件是否可执行：" + executable);

        File newFile = new File("F:\\test\\stu\\new.txt");
        File parentFile = newFile.getParentFile();
        if(!parentFile.exists()){//通常会与创建目录的方法配合使用
            //创建父级目录，但只能创建一级
//            parentFile.mkdir();
            //创建多级父级目录
            parentFile.mkdirs();
        }
        if(!newFile.exists()){
            try {
                //创建文件时，必须保证改文件的父级目录存在，否则，创建将报IO异常
                boolean success = newFile.createNewFile();
                System.out.println("文件创建是否成功：" + success);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        boolean deleteSuccess = file.delete();
        System.out.println("文件删除是否成功：" + deleteSuccess);
        //删除文件夹时，必须保证文件夹中没有任何文件，也就是保证文件夹是空的
        boolean deleteFolderSuccess = parentFile.delete();
        System.out.println("文件夹删除是否成功：" + deleteFolderSuccess);

        File renameDest = new File("F:\\test\\a.txt");
        //文件重命名至目标文件夹时，必须保证目标文件夹存在。重命名操作成功后，原来的文件
        //就移动过去了。
        boolean renameSuccess = newFile.renameTo(renameDest);
        System.out.println("文件重命名是否成功：" + renameSuccess);
    }
}
