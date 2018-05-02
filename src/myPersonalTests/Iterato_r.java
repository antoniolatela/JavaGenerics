package myPersonalTests;

import java.lang.reflect.Array;
import java.util.*;

public class Iterato_r<T> implements Collection<T>{
    private Collection<T> ll = new LinkedList<T>();
    private ArrayList<T> al = new ArrayList<>();
    @Override
    public int size() {
        return al.size();
    }

    @Override
    public boolean isEmpty() {
        return (al.size()==0) ? true : false;
    }

    @Override
    public boolean contains(Object t) {
        return al.contains((T)t);
    }

    @Override
    public Iterator iterator() {
        return al.iterator();
    }

    @Override
    public T[] toArray() {
        return (T[]) al.toArray();
    }

    @Override
    public boolean add(T t) {
        al.add(t);
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public static void main(String[] args) {
        Collection c = new Iterato_r();
        System.out.println(c.isEmpty());
        c.add(1);
        c.add("s");
        c.add(new Integer("1"));

        Iterator i = c.iterator();
        System.out.println(c.isEmpty());
        while(i.hasNext()) {
            Object element = i.next();
            System.out.println(element.toString());
        }

    }
}
