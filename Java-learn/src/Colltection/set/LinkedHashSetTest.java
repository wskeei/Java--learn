package Colltection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("D");
        strings.add("C");
        strings.add("B");
        strings.add("A");
        for(String str: strings){
            System.out.println(str);
        }
    }
}
