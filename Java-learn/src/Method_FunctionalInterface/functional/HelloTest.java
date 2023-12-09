package Method_FunctionalInterface.functional;

public class HelloTest {

    public static void main(String[] args) {
//        Hello hello = name -> System.out.println(name);
        Hello hello = System.out::println;
        hello.sayHello("Marry");
    }
}
