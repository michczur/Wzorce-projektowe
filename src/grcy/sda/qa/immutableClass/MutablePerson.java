package grcy.sda.qa.immutableClass;


/**
 * Mutable class person
 *
 * Klasa mutowalna bo po utworzeniu obiektu możemy zmieniać jego pola
 *
 */
public class MutablePerson {
    private String name;
    private String surname;

    public MutablePerson(String name, String surname) {
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

    //Nie tylko settery mogą zmieniać stan pól
    public void updateSurname(String updated, boolean add) {

        if(add) {
            surname += " - " + updated;
        } else {
            surname = updated;
        }
    }
}
