package 策略模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 15:31
 * @Description
 */
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}