package Test;


public class BookTest {
    public static void main(String[] args) {
        // 创建图书对象并初始化
        Book book1 = new Book("Java编程思想", "Bruce Eckel", "机械工业出版社", 99.0);
        Book book2 = new Book("Effective Java", "Joshua Bloch", "机械工业出版社", 89.0);

        // 输出图书信息
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
