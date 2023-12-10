package Test;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private double price;

    // 无参构造函数
    public Book() {
    }

    // 有参构造函数
    public Book(String name, String author, String publisher, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    // 获取图书名称
    public String getName() {
        return name;
    }

    // 设置图书名称
    public void setName(String name) {
        this.name = name;
    }

    // 获取作者
    public String getAuthor() {
        return author;
    }

    // 设置作者
    public void setAuthor(String author) {
        this.author = author;
    }

    // 获取出版社
    public String getPublisher() {
        return publisher;
    }

    // 设置出版社
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // 获取价格
    public double getPrice() {
        return price;
    }

    // 设置价格
    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}