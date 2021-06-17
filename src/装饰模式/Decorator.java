package 装饰模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 17:30
 * @Description 抽象装饰角色
 */
public class Decorator implements  Component{
    private  Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
