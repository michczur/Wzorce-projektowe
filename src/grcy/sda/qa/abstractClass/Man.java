package grcy.sda.qa.abstractClass;

public class Man extends Person {
    private int age;
    private boolean canRun;

    public Man(String name, String surname, int age, boolean canRun) {
        super(name, surname);
        this.age = age;
        this.canRun = canRun;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
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

    //nadpisujemy metodę z klasy Person własną wersją charakterystyczną dla klasy Man
    @Override
    public boolean isRunner() {
        return canRun;
    }
}
