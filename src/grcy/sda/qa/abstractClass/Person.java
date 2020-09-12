package grcy.sda.qa.abstractClass;

import java.util.Objects;

/**
 * Klasa abstrakcyjna
 *  - może mieć konstruktory
 *  - może mieć pola
 *  - może mieć metody z ciałem
 *  - może (powinna) mieć metody abstrakcyjne
 */

public abstract class Person implements Runner, Comparable<Person> {
    private String name;
    private String surname;

    public Person() {
        System.out.println("Person: Konstruktor bezparametrowy w akcji!!!");
    }

    public Person(String name, String surname) {
        System.out.println("Person: Konstruktor z parametrami");
        this.name = name;
        this.surname = surname;
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
     * jak dwa obiekty mają ten sam hashCode to niekoniecznie zajdzie na nich equals
     *
     * ale
     *
     * jak dwa obiekty zwracają equals = true
     * to ich hashcode też będzie takie samo (a właściwie powinien być)
     *
     */
    @Override
    public boolean equals(Object o) {
        //czy o jest w tym samym miejscu w pamięci co nasz obiekt "this"
        if (this == o) return true;

        //jeśli porównujemy z nullem to nie ten sam obiekt co nasz "this"
        //lub
        //jeśli klasa naszego obiektu i klasa obiektu do porównania
        //są różne to nie są te same obiekty
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        //na końcu sprawdzamy obiekt wg założonych przez nas kryteriów
        //że ma się zgadzać imię i nazwisko
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    //zwraca identyfikator (wartość int)
    //obiektu bazując na indentyfikatorach obliczonych z wskazanych pól
    @Override
    public int hashCode() {
        //oblicza identyfikator obiektu z wskazanych pól
        //niekoniecznie wszystkich pól klasy
        return Objects.hash(name, surname);
    }

    /**
     * compareTo stosujemy do porównania obiektów wg najbardziej naturalnego kryterium (porządku)
     */
    @Override
    public int compareTo(Person person) {
        return (this.name + this.surname).compareTo(person.getName() + person.getSurname());
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
}
