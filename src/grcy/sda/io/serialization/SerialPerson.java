package grcy.sda.io.serialization;

import java.io.Serializable;

public class SerialPerson implements Serializable {
    private transient int id; //transient oznacza że tego pola nie będziemy przesyłać w strumieniu

    private transient String name;
    private String surname;
    private int age;
    private String gender;

    public SerialPerson(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        System.out.println("Jestem w toStringu");

        return "SerialPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
