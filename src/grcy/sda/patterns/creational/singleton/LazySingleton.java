package grcy.sda.patterns.creational.singleton;

public class LazySingleton {
    private static LazySingleton LS_INSTANCE;

    private LazySingleton() {
        System.out.println("Lazy singleton constructor");
    }

    public static LazySingleton getInstance() {
        System.out.println("Lazy singleton getInstance()");

        if(LS_INSTANCE == null) {
            System.out.println("LS_INSTANCE null, constructor calling...");
            LS_INSTANCE = new LazySingleton();
        }
        return LS_INSTANCE;
    }
}
