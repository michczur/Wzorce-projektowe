package grcy.sda.qa.abstractClass;

public class Child extends Person {
    private int age;
    private boolean canRun;

    public Child(String name, String surname, int age) {
        super(name, surname);
        this.age = age;
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
        return false;
    }

    @Override
    public void canRun(boolean yesNo) {
        canRun = yesNo;
    }
}
