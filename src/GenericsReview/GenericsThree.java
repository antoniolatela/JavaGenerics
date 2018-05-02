package GenericsReview;

import GenericsReview.Interfaces.Pair;

public class GenericsThree<K, V> implements Pair<K, V> {

    public final K key;
    public final V value;

    public GenericsThree(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println("K: " + key);
        System.out.println("V: " + value);
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new GenericsThree<>(1, "Apple");
        Pair<String, Integer> p2 = new GenericsThree<>("Banana", 2);
        print(p1.getKey(), p1.getValue());
        print(p2.getKey(), p2.getValue());
        print("hello", "world");
    }


}
