package grcy.sda.streams.refAccess;

public class Person2 {
    private String name;
    private String surname;

    public Person2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
