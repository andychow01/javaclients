package pers.harry.core.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> list1 = new Vector<>();
        System.out.println("list1.capacity(): " + list1.capacity());

        Integer[] intArray = {1, 2, 3};
        List<Integer> intList = new Vector<>(Arrays.asList(intArray));
        System.out.println(intList);

        Iterator<Integer> it = intList.iterator();
        while (it.hasNext()) {
            Integer intValue = it.next();
            System.out.print(intValue + ", ");
        }
        System.out.println();
    }
}
