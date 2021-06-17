package 外观模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/5 11:13
 * @Description
 */
public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
