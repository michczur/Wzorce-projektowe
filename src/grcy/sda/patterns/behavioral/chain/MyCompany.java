package grcy.sda.patterns.behavioral.chain;

public class MyCompany {
    private Employees employees;
    private AccessCheck accessCheck;

    public void setAccessCheck(AccessCheck check) {
        this.accessCheck = check;
    }

    public boolean enterRoom(String user) {
        if(accessCheck.doCheck(user)) {
            System.out.println("Access granted for " + user);
            return true;
        }
        System.out.println("Access denied for " + user);
        return false;
    }
}
