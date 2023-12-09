package IO.io.buffer;

import java.io.*;

public class Example3 {
    //lineSeparator = \r\n
    public static void main(String[] args) {
        String sourceFile = "F:\\buffer\\io.txt";
        String destFile = "F:\\copy\\copy.txt";
        File file = new File(destFile);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        try ( Reader reader = new FileReader(sourceFile);
              BufferedReader br = new BufferedReader(reader);
              Writer writer = new FileWriter(file);
              BufferedWriter bw = new BufferedWriter(writer)) {
            while (true){
                String line = br.readLine();//读行
                if(line == null) break;
                bw.write(line);//写行
                bw.newLine();//换行 =>相当于写入了一个 \r\n
            }
            bw.flush();
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String sourceFile, String destFile){
        File file = new File(destFile);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        try ( Reader reader = new FileReader(sourceFile);
              BufferedReader br = new BufferedReader(reader);
              Writer writer = new FileWriter(file);
              BufferedWriter bw = new BufferedWriter(writer)) {
            while (true){
                String line = br.readLine();//读行
                if(line == null) break;
                bw.write(line);//写行
                bw.newLine();//换行 =>相当于写入了一个 \r\n
            }
            bw.flush();
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readLine(){
        String path = "F:\\buffer\\io.txt";
        try ( Reader reader = new FileReader(path);
              BufferedReader bw = new BufferedReader(reader)){
            while (true){
                String line = bw.readLine();
                if(line == null) break;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeLine(){
        String path = "F:\\buffer\\io.txt";
        File file = new File(path);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        try (Writer writer = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write("这是第1行");
            bw.newLine();
            bw.write("这是第2行");
            bw.newLine();
            bw.write("这是第3行");
            bw.newLine();
            bw.write("这是第4行");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
