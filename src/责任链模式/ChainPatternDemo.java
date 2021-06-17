package 责任链模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 16:05
 * @Description
 */
public class ChainPatternDemo {
    public static void main(String[] args) {
        AbstractLogger loggerChain = Client.getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");
        System.out.println("=========================");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
