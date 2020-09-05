package grcy.sda.solid.dip.fixed;

public class DatabaseRepository implements Repository {
    @Override
    public void saveTask(String task) {
        System.out.println("Saving to database : " + task);
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Deleting from database : " + task);
    }
}
