package GenericsReview.ExampleWithClasses;

public class ClassOne<E> {

    public E e;

    public E getE() {
        return e;
    }

    public ClassOne(E e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return this.getE().toString();
    }

    public static void main(String[] args) {
        ClassOne<Contanct> co = new ClassOne<>(new Contanct("Ant", "lat", "123"));
        ClassOne<String> co1 = new ClassOne<>(new String("ciao"));
        System.out.println(co);
        System.out.println(co1);
    }
}
