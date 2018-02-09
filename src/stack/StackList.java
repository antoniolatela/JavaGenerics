package stack;

public class StackList<T> implements Stack<T> {
    private Object[] o;

    StackList() {
        o = new Object[0];
    }

    //@Override
    public void push(T t) {
        Object[] z = new Object[o.length+1];
        for(int i = 0; i<o.length; i++) {
            z[i] = o[i];
        }
        z[this.o.length] = t;
        this.o = z;
    }

    @Override
    public T pop() {
        T t = (T)o[o.length-1];
        Object[] z = new Object[o.length-1];
        for(int i = 0; i<o.length-1; i++) {
            z[i] = o[i];
        }
        o = z;
        return t;
    }

    @Override
    public int size() {
        return o.length;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        for (int i = 0; i<o.length; i++ ){
            sb.append("[" + o[i] + "]");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public<U extends Integer, Double, String> U pusha(U t) {
        return t;
    }


}
