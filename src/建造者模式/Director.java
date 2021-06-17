package 建造者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 14:56
 * @Description
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
