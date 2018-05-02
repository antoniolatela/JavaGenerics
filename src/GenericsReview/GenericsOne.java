package GenericsReview;

import java.util.Date;

public class GenericsOne {
    public static void main(String[] args) {
/*
        Comparable c = new Date().getTime();
        System.out.println(c.compareTo(new Date().getTime()));
*/
        Comparable<Date> c = new Date();
        System.out.println(c.compareTo(new Date()));
    }
}
