package 原型模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 11:54
 * @Description
 */
public class Circle  extends Shape{
    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
