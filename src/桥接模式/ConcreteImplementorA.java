package 桥接模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 16:51
 * @Description
 */
public class ConcreteImplementorA  implements  Implementor{
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
