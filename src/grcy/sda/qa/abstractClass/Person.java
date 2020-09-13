package grcy.sda.qa.abstractClass;

import java.util.Objects;

/**
 * Klasa abstrakcyjna
 * - może mieć konstruktory
 * - może mieć pola
 * - może mieć metody z ciałem
 * - może (powinna) mieć metody abstrakcyjne
 */

public abstract class Person implements Runner, Comparable<Person> {
    private String name;
    private String surname;
    private Integer pesel;

    public Person() {
        System.out.println("Person: Konstruktor bezparametrowy w akcji!!!");
    }

    public Person(String name, String surname) {
        System.out.println("Person: Konstruktor z parametrami");
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
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

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public abstract void setAge(int age);

    public abstract int getAge();

    public abstract boolean isAdult();

    // W klasie abstrakcyjnej możemy ale nie musimy definiować metod
    // odziedziczonych z interfejsu który implementujemy
    // jak tu zaimplementujemy to możemy ale nie musimy ich definiować
    // w klasach pochodnych
    @Override
    public boolean isRunner() {
        return false;
    }


    /**
     * compareTo stosujemy do porównania obiektów wg najbardziej naturalnego kryterium (porządku)
     */
    @Override
    public int compareTo(Person person) {
        return (this.name + this.surname + this.pesel).compareTo(person.getName() + person.getSurname() + person.getPesel());
    }

    @Override
    public String toString() { return this.name + " " + this.surname+ " - " +this.pesel ;  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pesel == person.pesel &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, pesel);
    }
}

