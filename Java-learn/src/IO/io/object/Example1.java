package com.cyx.io.object;

import java.io.*;

public class Example1 {

    public static void main(String[] args) {
        writeObject();
        readObject();
    }

    private static void readObject(){
        String path = "F:\\obj\\stu.obj";
        try (InputStream is = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(is)){
            Student s = (Student) ois.readObject();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeObject(){
        String path = "F:\\obj\\stu.obj";
        File file = new File(path);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        try (OutputStream os = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(new Student("张三", 20));
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
