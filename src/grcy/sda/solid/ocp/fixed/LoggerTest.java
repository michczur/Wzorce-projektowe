package grcy.sda.solid.ocp.fixed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LoggerTest {

    public static void main(String[] args) {

        //interfejs = new klasa()
        MessageLogger messageLogger = new ConsoleLogger();

        Logger logger = new Logger(messageLogger);

        try {
            logger.log("aaa");
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
