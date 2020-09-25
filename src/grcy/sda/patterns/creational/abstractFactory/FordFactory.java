package grcy.sda.patterns.creational.abstractFactory;

public class FordFactory {

    public static Ford createFord(FordAbstractFactory factory) {
        return factory.createFord();
    }
}
