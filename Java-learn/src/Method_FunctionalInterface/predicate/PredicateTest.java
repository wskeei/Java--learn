package Method_FunctionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
//        Predicate<String> p1 = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.contains("中国");
//            }
//        };
        Predicate<String> p1 = s -> s.contains("中");
        boolean result1 = p1.test("中华人民共和国");
        System.out.println(result1);

        Predicate<String> p2 = s -> s.indexOf("啊") > 0;
        boolean result2 = p2.test("中华人民共和国");
        System.out.println(result2);

        Predicate<String> p3 = p1.negate();//取反
        System.out.println(p3.test("中华人民共和国"));

        Predicate<String> p4 = p1.and(p2); //逻辑与衔接
        System.out.println(p4.test("中华人民共和国"));

        Predicate<String> p5 = p1.or(p2);//逻辑或衔接
        System.out.println(p5.test("中华人民共和国"));
    }
}
