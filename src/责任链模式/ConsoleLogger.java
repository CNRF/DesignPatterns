package 责任链模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 16:04
 * @Description
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
