package grcy.sda.patterns.creational.singleton;

public class SingletonsTest {
    public static void main(String[] args) {
        EagerSingleton onlyOneInstance = EagerSingleton.getInstance();

        //nie można utworzyć nowego (kolejnego) obiektu EagerSingleton
        //bo ma on prywatny konstruktor
        //EagerSingleton eagerSingleton = new EagerSingleton();

        System.out.println(onlyOneInstance.getMINIMUM_SALARY());

        System.out.println(EagerSingleton.getInstance().getMINIMUM_SALARY());
        System.out.println("==============");
        LazySingleton lazyInstance = LazySingleton.getInstance();
        LazySingleton.getInstance();
        LazySingleton.getInstance();
        LazySingleton.getInstance();
        LazySingleton.getInstance();
    }
}
