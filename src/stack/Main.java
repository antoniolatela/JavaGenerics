package stack;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new StackList<>();
        Stack<String> ss = new StackList<>();
        ss.push("uno");
        ss.push("due");
        ss.push("tre");
        System.out.println(ss);
        System.out.println(ss.pop() +" "+ ss.toString());



    }
}
