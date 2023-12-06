package IO.file;

import java.io.File;

/**
 * File类构造方法的使用
 */
public class Example1 {

    public static void main(String[] args) {
        File file1 = new File("F:\\a\\b\\c.txt");
        File file2 = new File("F:\\a\\b", "c.txt");

        File parent = new File("F:\\a\\b");
        File file3 = new File(parent, "c.txt");
    }
}
