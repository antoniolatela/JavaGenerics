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

    public static int contaFinoA100(int i) {
        if (i<10000){
            return contaFinoA100(i+1);
        } else {
            return i;
        }
    }

    public static void main(String[] args) {
        System.out.println(contaFinoA100(1));
        Integer[] a = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        printList(a);
        String[] s = new String[]{"a","b","c"};
        compareTo(s, "c");
        compareTo(a, 5);

        printList(s);
    }
}
