package grcy.sda.qa.immutableClass;

/**
 *
 * Klasa niemutowalna bo po zainicjowaniu obiektu nie ma już możliwości zmiany jego pól
 *
 * Klasy niemutowalne powodują że jest zdecydowanie mniej problemów z progamowaniem
 * w aplikacjach wielowątkowych
 */
public class ImmutablePerson {
    private String name;
    private String surname;

    public ImmutablePerson(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    /**
     * Nie ma setterów ani innych metod zmieniających stan
     *
     * np modyfikujących nazwisko po zmianie stanu cywilnego
     */
}
