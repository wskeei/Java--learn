package E6;

public class TestStudent {
    public static void main(String[] args) {
        try {
            System.out.println(111);
            Student s1 = new Student(1, "", 20);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Student s2 = new Student(2, "Bob", -10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Student s3 = new Student(3, "Alice", 120);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
