package 外观模式;


/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/5 11:12
 * @Description
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
