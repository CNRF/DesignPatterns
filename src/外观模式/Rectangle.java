package 外观模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/5 11:11
 * @Description
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
