package grcy.sda.patterns.behavioral.chain;

public class CompanyInsiderCheck extends AccessCheck {
    @Override
    public boolean doCheck(String username) {
        System.out.println("CompanyInsider check for " + username);
        if(Employees.checkEmployee(username)) {
            System.out.println("CompanyInsider check PASSED for " + username);
            return checkNextElement(username);
        }
        System.out.println("CompanyInsider check FAILED for " + username);
        return false;
    }
}
