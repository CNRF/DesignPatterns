package 原型模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 11:53
 * @Description
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
