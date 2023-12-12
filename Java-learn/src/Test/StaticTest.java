package Test;

public class StaticTest {
    public static void main(String[] args) {
        Static a = new Static();

        int c = Static.getnumber();
        System.out.println(c);
        System.out.println(Static.a);
    }
}
