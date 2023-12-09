package IO.io.buffer;

import java.io.*;

public class Example2 {

    public static void main(String[] args) {
        String sourceFile = "F:\\AA\\io.txt";
        String destFile = "F:\\file\\a.txt";
        copyFile(sourceFile, destFile);

    }

    public static void copyFile(String sourceFile, String destFile){
        File file = new File(destFile);
        File parentFile = file.getParentFile();
        if(!parentFile.exists()) parentFile.mkdirs();
        try ( Reader reader = new FileReader(sourceFile);
              BufferedReader br = new BufferedReader(reader);
              Writer writer = new FileWriter(destFile);
              BufferedWriter bw = new BufferedWriter(writer)){
            char[] buffer = new char[4096];
            while (true){
                int len = br.read(buffer);
                if(len == -1) break;
                bw.write(buffer, 0, len);
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
