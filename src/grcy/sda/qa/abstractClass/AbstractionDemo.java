package grcy.sda.qa.abstractClass;

import java.util.ArrayList;
import java.util.List;

public class AbstractionDemo {
    public static void main(String[] args) {
        //klasa jest abstrakcyjna więc nie można utworzyć z niej obiektu
        //Person person = new Person(); // to nie działa, nie skompiluje się nawet

        Person woman1 = new Woman();
        System.out.println("========GRUBA KRECHA==========");
        Person woman2 = new Woman(33);
        System.out.println("========GRUBA KRECHA==========");
        Person woman3 = new Woman("Anna", "Nowak", 22);
        Person woman4 = new Woman("Anna", "Nowak", 22, true);

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

        System.out.println("Lista biegaczy");
        for (Person person : people) {
            if(person.isRunner()) {
                System.out.println(person.getName() + " " + person.getSurname() + " is a runner");
            }
        }

        System.out.println("Lista biegaczy za pomocą streamów");
        people.stream()
                .filter(x -> x.isRunner())
                .forEach(x -> System.out.println(x.getName() + " " + x.getSurname() + " is a runner"));


        System.out.println("Pierwsi dwaj biegacze za pomocą streamów");
        //pierwsi dwaj biegacze
        people.stream()
                //operacje pośrednie można łączyć (tutaj filter i limit)
                .filter(Person::isRunner)
                .limit(2)
                .forEach(x -> System.out.println(x.getName() + " " + x.getSurname() + " is a runner"));

        System.out.println("Pierwsi dwaj biegacze za pomocą streamów");
        //3 osoby które nie są biegaczami
        people.stream()
                .filter(p -> !p.isRunner())
                .limit(3)
                .forEach(x -> System.out.println(x.getName() + " " + x.getSurname() + " is a runner"));

    }
}
