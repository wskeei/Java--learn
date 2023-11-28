package Colltection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("a");
        set.add("b");
        System.out.println(set.size());
        for(String str: set){
            System.out.println(str);
        }
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        set.addAll(hashSet);
        System.out.println("===================");
        for(String str: set){
            System.out.println(str);
        }
        System.out.println(set.contains("C"));
        System.out.println(set.remove("E"));
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
