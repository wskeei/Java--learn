package Colltection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("CN", "中华人名共和国");//第一次是放入
        map.put("EN", "英国");
        map.put("US", "美国");
        map.put("AU", "澳大利亚");
        map.put("CN", "中国");//第二次是修改
        for(String key: map.keySet()){
            System.out.println(key);
        }
        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey() + "=>" +entry.getValue());
        }
    }
}
