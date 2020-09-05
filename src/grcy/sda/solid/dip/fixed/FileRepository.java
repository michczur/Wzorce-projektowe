package grcy.sda.solid.dip.fixed;

public class FileRepository implements Repository {
    @Override
    public void saveTask(String task) {
        System.out.println("Saving file " + task +" to filesystem.");
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Delete file " + task + " from filesystem.");
    }
}
