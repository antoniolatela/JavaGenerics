package employee;

public class Main {
    public static void main(String[] args) {
        Person<Employee> e1 = new Person<>();
        Person<String> e3 = new Person<>();
        Person<Customer> e2 = new Person<>();
        e1.setPerson(new Employee());
        e1.getPerson().setAge(1);
        System.out.println(e1.getPerson().getAge());

        e3.setPerson(new String ("hi"));
        System.out.println(e3.getPerson());
    }
}
