package grcy.sda.qa.abstractClass;

import java.util.Comparator;

public class PersonByNameSurname implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {

        //Najpierw poszereguję po nazwiskach
        //jak są różne to zwracam wynik
        if(person1.getSurname().compareTo(person2.getSurname()) != 0) {
            return person1.getSurname().compareTo(person2.getSurname());
        }

        //jak doszło tu to znaczy że nazwiska są takie same i szeregujemy po imionach
        return person1.getName().compareTo(person2.getName());
    }
}
