package employee;

public class Person<E> {
    public E getPerson() {
        return e;
    }

    public void setPerson(E e) {
        this.e = e;
    }

    private E e;

}
