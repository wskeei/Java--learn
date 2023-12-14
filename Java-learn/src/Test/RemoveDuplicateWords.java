package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String inputFilePath = "D:\\Document\\test.txt"; // 输入文本文件路径
        String outputFilePath = "D:\\Document\\output.txt"; // 输出文本文件路径

        try {
            // 读取输入文本文件
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));

            // 使用Set来存储不重复的单词
            Set<String> uniqueWords = new HashSet<>();

            // 读取每一行，并处理其中的单词
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[\\p{Punct}\\s]+"); // 使用正则表达式分割单词
                for (String word : words) {
                    // 检查单词是否为纯字母且长度大于1
                    if (word.matches("[a-zA-Z]+") && word.length() > 1) {
                        uniqueWords.add(word.toLowerCase()); // 将单词转换为小写并添加到Set中
                    }
                }
            }

            reader.close();

            // 写入输出文本文件
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            // 将不重复的单词写入文件
            for (String word : uniqueWords) {
                writer.write(word);
                writer.newLine();
            }

            writer.close();

            System.out.println("去除重复单词并保存成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
