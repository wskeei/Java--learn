package nested_class.lambda;

public class PrintTimeTest {

    public static void main(String[] args) {
//        PrintTime p = new PrintTime() {
//            @Override
//            public void printTime() {
//                System.out.println(System.currentTimeMillis());
//            }
//        };

//        PrintTime p = () -> {
//            System.out.println(System.currentTimeMillis());
//        };
        PrintTime p = () -> System.out.println(System.currentTimeMillis());
        p.printTime();
    }
}
