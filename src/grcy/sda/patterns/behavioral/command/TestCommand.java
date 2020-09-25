package grcy.sda.patterns.behavioral.command;

public class TestCommand {
    public static void main(String[] args) {
        MyFile file = new MyFile("sample.txt");
        FileOperationPerformer performer = new FileOperationPerformer();

        performer.execute(new CreateFileOperation(file), "zawartosc poczatkowa");
        performer.execute(new UpdateFileOperation(file), "zawartosc dodatkowa");
        System.out.println(file.getContent());
        System.out.println("================");
        performer.execute(new UpdateFileOperation(file), "zawartosc kolejna");
        System.out.println(file.getContent());
        System.out.println("===============");
        performer.execute(new CreateFileOperation(file), "zawartosc resetowana");
        System.out.println(file.getContent());
        System.out.println("===============");
        performer.getFileOperationHistory()
                .forEach(System.out::println);
    }
}
