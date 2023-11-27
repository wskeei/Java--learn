package com.cyx.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

    public static void main(String[] args) {
        Student[] students = {
                new Student("张三", 25),
                new Student("李四", 21),
                new Student("王五", 23),
                new Student("龙华", 28)
        };
        Arrays.sort(students);
        for(Student s: students){
            System.out.println(s);
        }
        System.out.println("===================");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("张三", 25));
        studentList.add(new Student("李四", 21));
        studentList.add(new Student("王五", 23));
        studentList.add(new Student("龙华", 28));
        //对集合排序
        Collections.sort(studentList);
        for(Student s: studentList){
            System.out.println(s);
        }
        System.out.println("==========================");
        String[] strings = {"d","b","a","c"};
        Arrays.sort(strings);
        for(String str: strings){
            System.out.println(str);
        }
    }
}
