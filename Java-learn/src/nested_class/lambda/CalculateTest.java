package nested_class.lambda;

public class CalculateTest {

    public static void main(String[] args) {
//        Calculate  c = new Calculate() {
//            @Override
//            public int sum(int a, int b) {
//                return a + b;
//            }
//        };
//        Calculate c = (int a, int b) -> {
//            return a + b;
//        };
//        Calculate c = (a, b) -> {
//            return a + b;
//        };
        Calculate c = (a, b) -> a + b;

        int result = c.sum(1, 5);
        System.out.println(result);
    }
}
