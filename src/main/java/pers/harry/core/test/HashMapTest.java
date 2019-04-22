package pers.harry.core.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("aa", 11);
        map.put("bb", 22);
        map.put("cc", 33);

        System.out.println("map size: " + map.size());
        System.out.println("map: " + map);

        Set<String> keySet = map.keySet();
        System.out.println("keySet: " + keySet);

        Collection<Integer> values = map.values();
        System.out.println("values: " + values);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
