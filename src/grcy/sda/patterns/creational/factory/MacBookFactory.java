package grcy.sda.patterns.creational.factory;

public class MacBookFactory {
    public static MacBook getMacBook(String type, String name, String disc) {

        if(type.equalsIgnoreCase("Air")) {
            return new MacBookAir(name, disc);
        } else if (type.equalsIgnoreCase("Pro")) {
            return new MacBookPro(name, disc);
        } else {
            throw new MacBookTypeNotKnownException(type);
        }
    }
}
