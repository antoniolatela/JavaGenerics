import java.util.Date;

public class GenericsExample {
    public static void main(String[] args) {
//        Comparable c = new Date();
//        System.out.println(c.compareTo("Thu Feb 08 10:21:08 GMT 2018"));

        Comparable<Date> c = new Date();
//        System.out.println(c.compareTo(""));
    }
}
