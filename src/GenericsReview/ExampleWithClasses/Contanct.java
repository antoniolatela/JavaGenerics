package GenericsReview.ExampleWithClasses;

public class Contanct {

    String name;
    String surname;
    String phone;

    public Contanct(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contanct{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
