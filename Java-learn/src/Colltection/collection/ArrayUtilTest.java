package Colltection.collection;

import java.util.AbstractCollection;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        util.add(1);
        util.add(2);
        util.add(3);
        util.add(4);
        util.add(5);
        for(int i=0; i<util.size(); i++){
            Object o = util.get(i);
            System.out.println(o);
        }
        System.out.println("=================");
        util.update(1, 10);
        for(int i=0; i<util.size(); i++){
            Object o = util.get(i);
            System.out.println(o);
        }
        System.out.println("=================");
        util.delete(4);
        for(int i=0; i<util.size(); i++){
            Object o = util.get(i);
            System.out.println(o);
        }
        System.out.println("=================");

    }
}
