package grcy.sda.solid.dip.fixed;

public class Test {
    public static void main(String[] args) {
        Repository repository = new FileRepository();
        TaskService service = new TaskService(repository);

        service.addTask("NewFile.txt");
        service.removeTask("OldFile.txt");

        ///// DATABASE

        repository = new DatabaseRepository();
        service = new TaskService(repository);
        service.addTask("Accounts");
        service.removeTask("Customers");
    }
}
