package 桥接模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 16:52
 * @Description 扩展抽象化角色
 */
public class RefinedAbstraction extends Abstraction{
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.OperationImpl();
    }
}
