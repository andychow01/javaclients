package pers.harry.core.test;

import org.junit.Test;
import java.io.*;

public class JavaIOTest {

    @Test
    private static void writFileTest() throws FileNotFoundException,
            IOException {
        // 创建文件对象
        File file = new File("data/data1.txt");
        // 创建文件输出流
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("abcd".getBytes());
        fos.close();
    }

    @Test
    private static void readFileTest() throws FileNotFoundException,
            IOException {
        // 创建文件对象
        File file = new File("data/data1.txt");
        System.out.println("file lengh: " + file.length());
        // 创建文件输入流
        FileInputStream fis = new FileInputStream(file);
        // 有对多长，就读多少字节。
        for (int i = 0; i < file.length(); i++) {
            System.out.print((char) fis.read());
        }
        fis.close();
    }

    public static void main(String[] args) {

        try {
            JavaIOTest.writFileTest();
            JavaIOTest.readFileTest();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
