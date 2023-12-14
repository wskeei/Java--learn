package Test;

import java.io.*;

public class SevenTest {
    public static void main(String[] args) {
        File score  = new File("src/word.txt");

        try (Reader reader = new FileReader(score);
            BufferedReader br = new BufferedReader(reader);) {
            while (true){
                String line = br.readLine();
                if(line == null) break;

                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
