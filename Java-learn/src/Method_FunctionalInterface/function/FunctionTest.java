package Method_FunctionalInterface.function;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
//        Function<String,Integer> f1 = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        };
//        Function<String,Integer> f1 = s -> Integer.parseInt(s);

        Function<String,Integer> f1 = Integer::parseInt;
        Integer i = f1.apply("123");
        System.out.println(i);

//        Function<Integer,Double> f2 = new Function<Integer, Double>() {
//            @Override
//            public Double apply(Integer integer) {
//                return integer * 10.0;
//            }
//        };
        Function<Integer,Double> f2 = integer -> integer * 10.0;
        System.out.println(f2.apply(i));

        Function<String,Double> f3 = f1.andThen(f2);
        double d = f3.apply("5");
        System.out.println(d);
    }
}
