package grcy.sda.qa.abstractClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        Person woman1 = new Woman();
        woman1.setName("Maria");
        woman1.setSurname("Piekarska");
        Person woman2 = new Woman(33);
        woman2.setName("Wioletta");
        woman2.setSurname("Bartniak");
        Person woman3 = new Woman("Anna", "Nowak", 22);
        Person woman4 = new Woman("Regina", "Nijaś", 22, true);

        Person child1 = new Child("Paweł", "Kieras", 10);
        Person child2 = new Child("Marek", "Walczak", 12);
        child2.canRun(true);
        Person child3 = new Child("Paulina", "Murias", 8);
        child3.canRun(true);
        Person man1 = new Man("Antoni", "Walas", 34, true);
        Person man2 = new Man("Rafał", "Nowacki", 21, false);
        Person man3 = new Man("Wacław", "Stępień", 77, true);

        List<Person> people = new ArrayList<>();
        people.add(woman1);
        people.add(woman2);
        people.add(woman3);
        people.add(woman4);
        people.add(child1);
        people.add(child2);
        people.add(child3);
        people.add(man1);
        people.add(man2);
        people.add(man3);

        System.out.println("=======List unsorted:=========");
        people.stream()
                .forEach(System.out::println);

        Collections.sort(people);
        System.out.println("=======List sorted:=========");

        people.stream()
                .forEach(System.out::println);


        System.out.println("=======List sorted surname name:=========");
        //Można też tak - jawnie
        //Comparator comparator = new PersonByNameSurname();
        //Collections.sort(people, comparator);

        //komparator wywołany jako klasa anonimowa
        Collections.sort(people, new PersonByNameSurname());
        people.stream()
                .forEach(System.out::println);

        //Do klasy Person dołożyć pole pesel
        //dołożyć nowy komparator zewnętrzny porównujący po peselu a potem nazwisko i imię
        //wyświetlić te dane (łącznie z peselem) po posortowaniu
    }
}
