package 建造者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 14:56
 * @Description
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();


        Builder builder1 = new ConcreteBuilder1();
        Director director1 = new Director(builder1);
        Product product1 = director1.construct();
        product1.show();

    }
}
