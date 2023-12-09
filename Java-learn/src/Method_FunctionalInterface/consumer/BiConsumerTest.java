package Method_FunctionalInterface.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {

    public static void main(String[] args) {
//        BiConsumer<String,Integer> bc = new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s + "=>" + integer);
//            }
//        };
        BiConsumer<String,Integer> bc = (s, i) -> System.out.println(s + "=>" + i);
        bc.accept("a", 1);

        Map<String,String> counties = new HashMap<>();
        counties.put("CN", "中国");
        counties.put("EN", "英国");
        counties.put("US", "美国");
//        counties.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String s1, String s2) {
//                System.out.println(s1 + "=>" + s2);
//            }
//        });
        counties.forEach((s1, s2)-> System.out.println(s1 + "=>" + s2));
    }
}
