package Method_FunctionalInterface.function;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Exercise {

    public static void main(String[] args) {
        String path = "F:/stu.txt";
//        Function<String, Student> function = new Function<String, Student>() {
//            @Override
//            public Student apply(String s) {
//                return new Student(s.split(","));
//            }
//        };
        Function<String, Student> function = s -> new Student(s.split(","));
        List<Student> students = readStudent(path, function);
        students.forEach(System.out::println);
        System.out.println("========================");
//        Function<String[], Student> f = new Function<String[], Student>() {
//            @Override
//            public Student apply(String[] strings) {
//                return new Student(strings);
//            }
//        };
//        Function<String[], Student> f =  strings -> new Student(strings);
        Function<String[], Student> f =  Student::new;
        List<Student> stus = readStudent1(path, f);
        stus.forEach(System.out::println);
    }

    public static List<Student> readStudent1(String path, Function<String[], Student> function){
        List<Student> students = new ArrayList<>();
        try (FileReader reader = new FileReader(path);
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null){
                String[] arr = line.split(",");
                Student stu = function.apply(arr);
                students.add(stu);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static List<Student> readStudent(String path, Function<String, Student> function){
        List<Student> students = new ArrayList<>();
        try (FileReader reader = new FileReader(path);
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null){
                Student stu = function.apply(line);
                students.add(stu);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }


    private static class Student {

        private String name;

        private String sex;

        private int age;

        public Student(String[] arr) {
            this.name = arr[0];
            this.sex = arr[1];
            this.age = Integer.parseInt(arr[2]);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
