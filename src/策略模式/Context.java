package 策略模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 15:31
 * @Description
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
