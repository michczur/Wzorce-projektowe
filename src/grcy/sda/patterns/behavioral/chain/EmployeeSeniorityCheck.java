package grcy.sda.patterns.behavioral.chain;

public class EmployeeSeniorityCheck extends AccessCheck {
    private final int MINIMUM_ACCESS_LEVEL = 10;
    @Override
    public boolean doCheck(String username) {
        System.out.println("EmployeeSeniorityCheck for " + username);
        if(Employees.checkEmployeeLevel(username) >= MINIMUM_ACCESS_LEVEL) {
            System.out.println("EmployeeSeniorityCheck PASSED for " + username);
            return checkNextElement(username);
        }
        System.out.println("EmployeeSeniorityCheck FAILED for " + username);
        return false;
    }
}
