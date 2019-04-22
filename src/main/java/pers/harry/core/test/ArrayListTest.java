package pers.harry.core.test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("aa");
        list1.add("bb");
        System.out.println(list1);

        String[] array1 = {"aa", "bb", "cc"};
        List<String> stringList = new ArrayList<>(Arrays.asList(array1));
        //List<String> stringList = Arrays.asList("aa", "bb", "cc");
        System.out.println(stringList);
    }
}
