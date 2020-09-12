package grcy.sda.patterns.creational.factory;

public class MacBookTypeNotKnownException extends IllegalArgumentException {

    public MacBookTypeNotKnownException(String message) {
        super("Dont know of given Macbook type: " + message);
    }
}
