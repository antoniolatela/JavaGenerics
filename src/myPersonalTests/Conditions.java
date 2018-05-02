package myPersonalTests;

import static java.lang.System.out;

public class Conditions {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;

        if ((t || f) && (!f && !f)){
            System.out.println("hi");
        }
        char s = "zbtr".toCharArray()[0];

        switch (s){
            case ('c'):
                out.println("a");
                break;
            case ('b'):
                out.println("b");
                break;
            default:
                throw new AssertionError("ABCDE");
        }


    }
}
