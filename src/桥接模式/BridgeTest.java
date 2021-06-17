package 桥接模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 16:53
 * @Description
 */
public class BridgeTest {
    public static void main(String[] args) {

        Implementor implementor  = new ConcreteImplementorA();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(implementor);
        refinedAbstraction.Operation();
    }
}
