package 建造者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 14:55
 * @Description
 */
public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
