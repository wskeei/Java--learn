package IO.io._char;

import java.io.*;

public class Example2 {

    public static void main(String[] args) {
        try (Reader reader = new FileReader("F:\\aa\\io.txt");) {
//            StringBuilder builder = new StringBuilder();
//            while (true){
//                int c = reader.read();
//                if(c == -1) break;
//                builder.append((char)c);
//            }
//            System.out.println(builder);
            char[] buffer = new char[4096];
            int offset = 0;
            while (true){
//                int len = reader.read(buffer);
                int len = reader.read(buffer, offset, 30);
                if(len == -1) break;
                offset += len;
            }
            System.out.println(new String(buffer, 0, offset));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
