package GenericsReview;

public class GenericClasses<T> { //Type parameter!

    T t;

    public GenericClasses(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        GenericClasses<Number> gc = new GenericClasses<>(1.1); //Type arguent!!!
        GenericClasses<String> gc1 = new GenericClasses<>("1.1"); //Type arguent!!!
        GenericClasses<Double> gc2 = new GenericClasses<>(1.1); //Type arguent!!!
        System.out.println(gc2.getT()*gc2.getT()*(Double) gc.getT());
    }
}
