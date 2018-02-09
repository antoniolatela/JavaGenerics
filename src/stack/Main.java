package stack;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new StackList<>();
        Stack<String> ss = new StackList<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.size());
        System.out.println(s.toString());

        s.pop();
        System.out.println(s.size());
        System.out.println(s);
        //System.out.println(ss.pop() +" "+ ss.toString());
        //ss.pusha(2);



    }
}
