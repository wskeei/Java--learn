package com.cyx.io._byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 使用文件输入流将文件信息从磁盘中读取到内存中来，并在控制台输出。
 */
public class Example2 {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("F:\\aa\\io.txt");
            int length = is.available();//获取通道中的数据长度
            //根据通道中数据的长度构建字节数组。但需要考虑到一点，如果通道中数据长度过长
            //那么字节数组构建太大，则可能导致内存不够，比如使用流读取一个大小为10G的文件
            byte[] buffer = new byte[length];
//            int index = 0;
//            while (true){
//                //读取通道中的数据，一次读取一个字节。如果读取到末尾，则返回-1
//                byte b = (byte) is.read();
//                if(b == -1) break;
//                buffer[index++] = b;
////                index++;
//            }
            int readCount = is.read(buffer); //将通道中的数据全部读取到buffer数组中
            System.out.println("读取了"+readCount+"个字节");
            System.out.println(new String(buffer));
            is.close();//关闭通道
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
