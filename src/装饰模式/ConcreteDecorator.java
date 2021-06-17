package 装饰模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 17:32
 * @Description
 */
public class ConcreteDecorator extends  Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }
    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
