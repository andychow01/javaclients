package pers.harry.core.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("aa", 11);
        map.put("bb", 22);
        map.put("cc", 33);

        System.out.println("map size: " + map.size());
        System.out.println("map: " + map);

        Set<String> keySet = map.keySet();
        System.out.println("keySet: " + keySet);

        Collection<Integer> values = map.values();
        System.out.println("values: " + values);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if (entry.getKey().equals("bb")) {
                entries.remove();
            }
        }
        System.out.println("map: " + map);

    }
}
