package grcy.sda.solid.ocp.fixed;

public class LoggerNewTest {
    public static void main(String[] args) {
        //interfejs = new klasa()
        MessageLogger messageLogger = new FileLogger();

        Logger logger = new Logger(messageLogger);

        try {
            logger.log("aaa");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
