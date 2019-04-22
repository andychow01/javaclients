package pers.harry.core.test;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");

        System.out.println("Set size: " + set.size());
        System.out.println("Set isEmpty(): " + set.isEmpty());

        System.out.println("Set: " + set);
        System.out.println("Set: " + set.toString());
        System.out.println("Set: " + set.hashCode());

        // iter遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.print(key + " ");
            if (key.equals("bb")) { // 删除
                it.remove();
            }
        }
        System.out.println();

        // for each遍历
        for (String key : set) {
            System.out.print(key + " ");
        }
        System.out.println();

    }
}
