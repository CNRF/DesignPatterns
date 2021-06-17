package 原型模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 11:50
 * @Description
 */
public class Rectangle extends Shape{
    public Rectangle(){
       type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
