package Method_FunctionalInterface._static.member;

public class ComputerTest {

    public static void main(String[] args) {
        Computer c = new Computer(new Printer());
        c.print("This is method reference");
    }
}
