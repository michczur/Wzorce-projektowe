package grcy.sda.qa.abstractClass;

public class Woman extends Person {
    private int age;
    private boolean canRun;

    public Woman() {
        System.out.println("Woman : Konstruktor bezparametrowy");
        //jeśli nie ma nic to wołany jest konstruktor bezparametrowy
        //super(); - to tu jest mimo że nie widać
    }

    public Woman(int age) {
        System.out.println("Woman : Konstruktor z 1 parametrem");
        //super();
        this.age = age;
    }

    public Woman(String name, String surname, int age) {
        //jawne wywołanie konstruktora nadklasy musi być pierwszą linią konstruktora klasy "podrzędnej"
        super(name, surname);

        System.out.println("Woman : Konstruktor z 3 parametrami");
        this.age = age;
    }

    public Woman(String name, String surname, int age, boolean canRun) {
        super(name, surname);
        this.age = age;
        this.canRun = canRun;
    }

    @Override
    public void setAge(int age) {
        this.age = 18;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public void canRun(boolean yesNo) {
        canRun = yesNo;
    }

    @Override
    public boolean isRunner() {
        return canRun;
    }


}
