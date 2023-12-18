package Test;

import java.io.*;

public class FileAppendExample {
    public static void main(String[] args) {
        // 文件路径
        String inputFile = "./word1.txt";
        String outputFile = "./word2.txt";

        // 使用 try-with-resources 语句确保流的正确关闭
        try (
                // 创建缓冲字符输入流
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));

                // 创建缓冲字符输出流，设置为追加模式
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))
        ) {
            // 读取 word1.txt 的内容并追加到 word2.txt 的末尾
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // 换行符
            }

            System.out.println("内容成功追加到 " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
