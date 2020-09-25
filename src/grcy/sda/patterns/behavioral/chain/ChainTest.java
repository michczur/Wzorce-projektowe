package grcy.sda.patterns.behavioral.chain;

public class ChainTest {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee("Jan Kowalski", 10);
        employees.addEmployee("Maria Zduń", 5);
        employees.addEmployee("Jan Zając", 20);

        AccessCheck accessCheck = new CompanyInsiderCheck();
        accessCheck.addChainElement(new EmployeeSeniorityCheck());

        MyCompany company = new MyCompany();
        company.setAccessCheck(accessCheck);

        System.out.println("==================");
        company.enterRoom("Adam Nowak");
        System.out.println("==================");
        company.enterRoom("Maria Zduń");
        System.out.println("==================");
        company.enterRoom("Jan Zając");
        System.out.println("==================");
    }
}
