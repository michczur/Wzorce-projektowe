package grcy.sda.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmployees {
    static List<String> employees;

    public CompanyEmployees() {
        this.employees = new ArrayList<>();
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public static boolean isEmployee(String username) {
        return employees.contains(username);
    }
}
