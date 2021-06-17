package 工厂模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 14:39
 * @Description
 */
public class FactoryTestDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("Circle").draw();
        shapeFactory.getShape("Rectangle").draw();
        shapeFactory.getShape("Square").draw();
    }
}
