package grcy.sda.streams.refAccess;

public class Person1 {
    private String name;
    private String surname;

    public Person1(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getPersonInfo() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "surname='" + surname + '\'' +
                '}';
    }
}
