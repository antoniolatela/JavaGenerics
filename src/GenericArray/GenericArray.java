package GenericArray;

public class GenericArray {
    public static<T> void printList(T[] list){
        for (T e:list){
            System.out.println(e);
        }
    }

    public static<T extends Comparable<T>> void compareTo(T[] list, T value){
        for(T t:list){
            System.out.println(t.compareTo(value));
            }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        printList(a);
        String[] s = new String[]{"a","b","c"};
        compareTo(s, "c");
        compareTo(a, 5);

        printList(s);
    }
}
