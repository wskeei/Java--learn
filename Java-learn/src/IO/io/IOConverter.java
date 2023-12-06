package com.cyx.io;

import java.io.*;

public class IOConverter {
    

    public static void main(String[] args) {
        write();
        read();
    }

    private static void write(){
        try (OutputStream os = new FileOutputStream("F:\\lines.txt");
             OutputStreamWriter osw = new OutputStreamWriter(os);
             BufferedWriter bw = new BufferedWriter(osw)){
            String[] lines = {
                    "这是写入的第1行",
                    "这是写入的第2行",
                    "这是写入的第3行",
                    "这是写入的第4行"
            };
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read(){
        try (InputStream is = new FileInputStream("F:\\lines.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr);) {
            while (true){
                String line = reader.readLine();
                if(line == null) break;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
