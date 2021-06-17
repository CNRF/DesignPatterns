package 访问者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:04
 * @Description
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
