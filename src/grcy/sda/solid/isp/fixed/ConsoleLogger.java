package grcy.sda.solid.isp.fixed;

public class ConsoleLogger implements Logger {
    @Override
    public void writeMessage(String message) {
        System.out.println("Writing new line to console: " + message);
    }
}
