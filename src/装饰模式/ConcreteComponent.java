package 装饰模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 17:30
 * @Description 具体构件角色
 */
public class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }
    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
