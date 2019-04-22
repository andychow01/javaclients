package pers.harry.core.test;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("aa");
        stack.push("bb");
        stack.push("cc");
        String value = stack.peek();
        System.out.println("value: " + value);
        stack.pop();

        System.out.println(stack);
    }
}
