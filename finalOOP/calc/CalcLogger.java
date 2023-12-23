package finalOOP.calc;
import java.util.logging.*;

class CalcLogger {
    private static Logger LOGGER = Logger.getLogger(CalcLogger.class.getName());

    public static void logInfo(String message) {
        LOGGER.log(Level.INFO, message);
    }
}