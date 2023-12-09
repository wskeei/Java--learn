package Method_FunctionalInterface.consumer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
//        Consumer<String> c1 = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };

//        Consumer<String> c1 = (String s) -> {
//            System.out.println(s);
//        };

//        Consumer<String> c1 =  s -> System.out.println(s);

        Consumer<String> c1 =  System.out::println;
        c1.accept("这是被消费的信息");

//        Consumer<String> c2 = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s.charAt(0));
//            }
//        };
        Consumer<String> c2 = s -> System.out.println(s.charAt(0));
        c2.accept("This is a consumer");

        //先执行c1,再做c2
        Consumer<String> c3 = c1.andThen(c2);
        c3.accept("先打印再取第一个字符");
        //将数组转换为集合
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
//
//        numbers.forEach(integer -> System.out.println(integer));
        numbers.forEach(System.out::println);

        Set<String> names = new HashSet<>();
        names.add("admin");
        names.add("test");
        names.add("developer");
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        names.forEach(System.out::println);
    }
}
