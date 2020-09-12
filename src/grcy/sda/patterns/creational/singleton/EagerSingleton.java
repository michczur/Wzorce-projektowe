package grcy.sda.patterns.creational.singleton;

public class EagerSingleton {
    private static final EagerSingleton ES_INSTANCE = new EagerSingleton();

    private final int MINIMUM_SALARY = 2000;

    private EagerSingleton() {
        System.out.println("Eager singleton constructor");
    }

    public static EagerSingleton getInstance() {
        System.out.println("Eager Singleton getInstance()");
        return ES_INSTANCE;
    }

    public int getMINIMUM_SALARY() {
        return MINIMUM_SALARY;
    }
}
