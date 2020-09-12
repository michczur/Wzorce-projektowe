package grcy.sda.streams.refAccess;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Person1 person1 = new Person1("Jan", "Kowalski");
        Person2 person2 = new Person2("Adam", "Nowak");

        System.out.println(person1);

        System.out.println(person2 /* wołany jest person2.toString() */);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person1.getPersonInfo());

        Person1 person11 = new Person1("Jan", "Kowalski");
        Person1 person12 = new Person1("Maria", "Bak");
        Person1 person13 = new Person1("Paweł", "Rola");
        Person1 person14 = new Person1("Renata", "Alicka");

        List<Person1> person1List = new ArrayList<>();
        person1List.add(person11);
        person1List.add(person12);
        person1List.add(person13);
        person1List.add(person14);

        System.out.println("==================");
        person1List.stream()
                .forEach(aaa -> System.out.println(aaa));
                //.forEach(System.out::println); //System.out.println(obiekt klasy Person1)

        System.out.println("==================");
        person1List.stream() //strumień obiektów klasy Person1
                .map(yyy -> yyy.getPersonInfo())
                //.map(Person1::getPersonInfo) //po map() mamy strumień Stringów powstałych
                // po wywołaniu getPersonInfo na kolejnych obiektach Person1
                .map(xxx -> "Po toLowerCase: " + xxx.toLowerCase())
                .forEach(System.out::println);

    }
}
