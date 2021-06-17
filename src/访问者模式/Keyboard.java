package 访问者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:03
 * @Description
 */
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
