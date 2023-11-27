package com.cyx.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

    public static void main(String[] args) {
        //集合有序是指存储顺序与遍历时取出来的顺序一致
        ArrayList<String> list = new ArrayList<>();
        list.add("a");//第一次调用 size =0;
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(2, "n");// a a b c d => a a b b c d => a a n b c d
        String old = list.set(1, "g");
        System.out.println(old);
        System.out.println("====================");
        for(String str: list){
            System.out.println(str);
        }
        System.out.println("====================");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String s = iter.next();
            System.out.println(s);
        }
        System.out.println("====================");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String s = listIterator.next();
            System.out.println(s);
        }
        System.out.println("====================");
        ListIterator<String> prevIterator = list.listIterator(list.size());
        while (prevIterator.hasPrevious()){
            String s = prevIterator.previous();
            System.out.println(s);
        }
        System.out.println("====================");

        List<String> subList = list.subList(2, 4);
        for(String str: subList){
            System.out.println(str);
        }
        System.out.println("====================");

        int size = list.size();
        for(int i=0; i<size; i++){
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("===================");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        //移除下标为3这个位置的元素
        numbers.remove(3);//这是移除下标为3这个位置的元素还是移除3这个元素？
        //移除3这个元素
        numbers.remove((Integer) 3);
        for(Integer number: numbers){
            System.out.println(number);
        }
        numbers.add(2);
        numbers.add(2);
        int index1 = numbers.indexOf(2);
        int index2 = numbers.lastIndexOf(2);
        System.out.println(index1);
        System.out.println(index2);
    }
}
