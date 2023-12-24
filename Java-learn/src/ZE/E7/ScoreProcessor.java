package E7;

import java.io.*;

public class ScoreProcessor {
    public static void main(String[] args) {
        // 文件路径
        String inputFile = "./score.txt";
        String outputFile = "./2022110527.txt";

        try (
                // 创建文件读取流
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                // 创建文件写入流
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            // 统计总分大于240分的人数
            int count = 0;

            // 读取文件内容并处理
            String line;
            while ((line = reader.readLine()) != null) {


                // 分割每行数据
                String[] data = line.split("，");

                // 解析学生信息
                String studentId = data[0];
                int englishScore = Integer.parseInt(data[1]);
                int mathScore = Integer.parseInt(data[2]);
                int chineseScore = Integer.parseInt(data[3]);

                // 计算总分
                int totalScore = englishScore + mathScore + chineseScore;

                // 判断总分是否大于240
                if (totalScore > 240) {
                    // 输出符合条件的同学信息到控制台
                    System.out.println("学号：" + studentId + "，总分：" + totalScore);

                    // 输出到文件
                    writer.write("学号：" + studentId + "，总分：" + totalScore);
                    writer.newLine();

                    // 计数器加一
                    count++;
                }
            }

            // 输出统计结果到控制台
            System.out.println("总分大于240分的同学人数：" + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
