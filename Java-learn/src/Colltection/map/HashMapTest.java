package Colltection.map;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {
        //HashMap采用的是数组、链表以及红黑树来存储数据。
        //链表的设计主要是针对于Hash碰撞而引发存储位置冲突
        //红黑树的设计主要是针对于链表过长，遍历速度太慢
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(17, "e");
        String value = map.get(1);
        System.out.println(value);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("e"));
        System.out.println(map.remove(17));
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(5, "CN");
        map1.put(6, "US");
        map1.put(7, "EN");
        map.putAll(map1);
        System.out.println(map.size());
        Set<Integer> keySet = map.keySet();
        for(Integer i: keySet){
            System.out.println(i);
        }
        System.out.println("=============");
        Collection<String> values = map.values();
        for(String str: values){
            System.out.println(str);
        }
        System.out.println("=============");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry: entries){
            Integer key = entry.getKey();
            String val = entry.getValue();
            System.out.println(key+"=>" + val);
        }
        System.out.println("=============");
        map.clear();
        System.out.println(map.size());
    }
}
