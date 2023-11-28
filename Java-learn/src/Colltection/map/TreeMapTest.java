package Colltection.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
//        TreeMap<Computer, Integer> map = new TreeMap<>();
//        map.put(new Computer("联想", 3000), 1);
//        map.put(new Computer("外星人", 30000), 2);
//        Set<Computer> set = map.keySet();
//        for(Computer comp: set){
//            System.out.println(comp);
//        }

//        Comparator<Computer> c = new Comparator<Computer>() {
//            @Override
//            public int compare(Computer o1, Computer o2) {
//                return 0;
//            }
//        };
//        Comparator<Computer> c = (Computer o1, Computer o2) -> {
//                return 0;
//        };
//        Comparator<Computer> c = (o1, o2) -> {
//            return Double.compare(o1.getPrice(), o2.getPrice());
//        };
        Comparator<Computer> c = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
//        Comparator<Computer> c = Comparator.comparingDouble(Computer::getPrice);

        TreeMap<Computer, Integer> map1 = new TreeMap<>(c);
        map1.put(new Computer("联想", 3000), 1);
        map1.put(new Computer("外星人", 30000), 2);
        Set<Computer> set = map1.keySet();
        for(Computer comp: set){
            System.out.println(comp);
        }
    }
}
