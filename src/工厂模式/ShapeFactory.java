package 工厂模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 14:36
 * @Description
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if ( shapeType== null) {
            return null;
        }
        if (shapeType.equals("Rectangle")){
            return new Rectangle();
        }
        if (shapeType.equals("Square")){
            return new Square();
        }
        if (shapeType.equals("Circle")){
            return new Circle();
        }
        return  null;
    }
}
