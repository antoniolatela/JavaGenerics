package stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StackList<T> implements Stack<T> {
    private List<T> l = new ArrayList<>();

    //@Override
    public void push(T t) {
        l.add(t);
    }

    @Override
    public T pop() {
        T t = l.get(l.size()-1);
        l.remove(l.size()-1);
        return t;
    }

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public String toString() {
        return "StackList{" +
                "l=" + l +
                '}';
    }
}
