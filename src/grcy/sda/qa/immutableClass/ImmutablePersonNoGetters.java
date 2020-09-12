package grcy.sda.qa.immutableClass;

/**
 * Klasa niemutowalna bez getterów
 *
 *
 */
public class ImmutablePersonNoGetters {
    public final String name;
    public final String surname;

    public ImmutablePersonNoGetters(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
