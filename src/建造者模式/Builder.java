package 建造者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 14:54
 * @Description
 */
abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象
    public Product getResult() {
        return product;
    }
}
