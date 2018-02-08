public class OrderPairClass <K, V> implements OrderPair <K, V> {
    private final K key;
    private final V value;


    public OrderPairClass(K key, V value) {
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
}
