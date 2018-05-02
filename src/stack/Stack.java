package stack;

import java.util.Collection;
import java.util.Iterator;

public interface Stack<T> {
    void pushAll(Collection<? extends T> stack);
    void push(T t);
    T pop() throws Exception;
    int size();
    public<U extends Integer, Double, String> U pusha(U t);
}
