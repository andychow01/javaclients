package pers.harry.core.test;

public class StringTest {

    public void createString() {
        //constructor
        String str1 = "abc";

        //equivalent to above one
        char[] data = {'a', 'b', 'c'};
        String str2 = new String(data);

        //equivalent to above one
        String str3 = new String(str2);

        //equivalent to above one
        String str4 = str3;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        str3 = "def";
        System.out.println(str3);   //def
        System.out.println(str4);   //abc
    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.createString();

    }
}
