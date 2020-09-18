package grcy.sda.reflections;

public class Student extends Person {
    private String name;    // dostep w klasie student (i klasach wewnetrznych dla studenta)
    protected String surname; // dostep w pakiecie i klasach dziedziczacych po student
    String uniwersity; // dosteo w tym samym pakiecie

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUniwersity() {
        return uniwersity;
    }

    public void setUniwersity(String uniwersity) {
        this.uniwersity = uniwersity;
    }

    private String getStudentInfo() {
        return  "name" + name + '\n';
    }

}
