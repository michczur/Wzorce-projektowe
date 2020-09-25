package grcy.sda.reflections;

public class Student extends Person {
    private String name; //dostęp tylko w klasie Student (w klasach wewnętrznych dla Student też)
    protected String surname; //dostęp w pakiecie i klasach dziedziczących po Student (te klasy mogą być w innych pakietach

    String university; //dostęp w tym samym pakiecie

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

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    private String getStudentInfo() {
        return " name= " + name + "\n surname= " + surname;

    }
}
