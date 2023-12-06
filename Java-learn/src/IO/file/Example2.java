package IO.file;

import java.io.File;

public class Example2 {

    public static void main(String[] args) {
        File file = new File("F:\\a\\b\\c.txt");
        //获取文件的绝对路径
        String absPath = file.getAbsolutePath();
        System.out.println(absPath);
        //获取文件的路径，可能是相对路径，也可能是绝对路径
        String path = file.getPath();
        System.out.println(path);
        String name = file.getName();//获取文件名
        System.out.println(name);
        //获取文件的父级文件夹对象
        File parentFile = file.getParentFile();
        System.out.println(parentFile.getPath());
        //获取文件的父级路径
        String parentPath = file.getParent();
        System.out.println(parentPath);
        //获取文件的大小，单位是字节
        long length = file.length();
        System.out.println(length);
        //获取文件的最后修改时间
        long lastUpdateTime = file.lastModified();
        System.out.println(lastUpdateTime);
        //获取系统当前时间：单位毫秒
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);

        File file1 = new File("chapter16\\c.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
    }
}
