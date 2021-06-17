package 装饰模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 17:33
 * @Description
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
