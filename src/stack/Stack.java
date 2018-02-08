package stack;

import java.util.Iterator;

public interface Stack<T> {
    void push(T t);
    T pop();
    int size();
}
