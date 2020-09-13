package grcy.sda.qa.abstractClass;

import java.util.Comparator;

public class PersonByPesel implements Comparator<Person> {


    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getPesel().compareTo(person2.getPesel()) != 0) {
            return person1.getPesel().compareTo(person2.getPesel());
        } else if (person1.getSurname().compareTo(person2.getSurname()) != 0) {
            return person1.getSurname().compareTo(person2.getSurname());
        }
        return person1.getName().compareTo(person2.getName());
    }
}
