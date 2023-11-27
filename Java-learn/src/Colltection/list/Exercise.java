package com.cyx.list;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 从控制台录入5位学生信息：姓名，性别，年龄，成绩，并将这些学生信息以","衔接起来，
 * 然后存储至文本中。然后再从文本中将这些信息读取至集合中。
 */
public class Exercise {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入性别：");
            String sex = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入成绩：");
            double score = sc.nextDouble();
            students.add(new Student(name, sex, age, score));
        }
        saveStudents(students, "F:\\stu\\stu.txt");

        List<Student> read =  readStudents("F:\\stu\\stu.txt");
        for(Student stu: read){
            System.out.println(stu);
        }
    }

    public static List<Student> readStudents(String path){
        List<Student> students = new ArrayList<>();
        try (FileReader reader = new FileReader(path);
            BufferedReader br =new BufferedReader(reader);){
            String line;
            while ((line = br.readLine()) != null){
                String[] arr = line.split(",");
                //name + "," + sex +"," + age + "," + score;
                String name = arr[0];
                String sex = arr[1];
                int age = Integer.parseInt(arr[2]);// Float.parseFloat()
                double score = Double.parseDouble(arr[3]);
                students.add(new Student(name, sex, age, score));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void saveStudents(List<Student> students, String path){
        File file = new File(path);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        try (FileWriter writer = new FileWriter(file);
             BufferedWriter bw =new BufferedWriter(writer);){
            for(Student stu: students){
                bw.write(stu.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
