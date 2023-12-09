package IO.io.buffer;

import java.io.*;

public class Example1 {

    public static void main(String[] args) {
        String sourceFile = "F:\\AA\\io.txt";
        String destFile = "F:\\file\\a.txt";
        copyFile(sourceFile, destFile);
    }

    public  static void copyFile(String sourceFile, String destFile){
        File file = new File(destFile);
        File parentFile = file.getParentFile();
        if(!parentFile.exists()) parentFile.mkdirs();
        try(InputStream is = new FileInputStream(sourceFile);
            BufferedInputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream(destFile);
            BufferedOutputStream bos = new BufferedOutputStream(os)) {
            byte[] buffer = new byte[4096];
            while (true){
                int len = bis.read(buffer);
                if(len == -1) break;
                bos.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
