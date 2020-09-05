package grcy.sda.solid.ocp.fixed;

public class Logger {
    private MessageLogger messageLogger;

    public Logger(MessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    /**
     * metoda log w tej postaci nie jest w żaden sposób
     * uzależniona od typu loggera i będzie działać niezależnie
     * od tego jaki konkretnie message logger będzie użyty
     *
     */
    public void log(String message) throws Exception {
        messageLogger.log(message);
    }
}
