package Colltection.collection;


import java.util.Iterator;

public class MyCollectionTest {

    public static void main(String[] args) {
        MyCollection<String> c = new MyCollection<>();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");



        MyCollection<String> c1 = new MyCollection<>();
        c1.add("b");
        c1.add("c");
        c1.add("d");

        boolean contains1 = c.containsAll(c1);
        System.out.println(contains1);


        MyCollection<Integer> c2 = new MyCollection<>();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        boolean contains2 = c.containsAll(c2);
        System.out.println(contains2);
        //泛型使用通配符的集合不能存储数据，只能读取数据
        MyCollection<?> c3 = new MyCollection<>();
//        c3.add(1);
//        c3.add("");
    }
}
