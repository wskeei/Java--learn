package Method_FunctionalInterface._static;

import nested_class.inner_class.anonymous_class.Calculate;

public class CalculatorTest {

    public static void main(String[] args) {
//        Calculator c = new Calculator() {
//            @Override
//            public int calculate(int a, int b) {
//                return MathUtil.minus(a, b);
//            }
//        };
//        Calculator c = (int a, int b) -> {
//            return MathUtil.minus(a, b);
//        };
//        Calculator c = (a, b) -> MathUtil.minus(a, b);


        Calculator c = MathUtil::minus;
        int result = c.calculate(1, 10);
        System.out.println(result);

        Calculator c1 = MathUtil::multiply;
        int result1 = c1.calculate(1, 10);
        System.out.println(result1);
    }
}
