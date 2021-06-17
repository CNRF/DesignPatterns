package 外观模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/5 11:13
 * @Description
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
