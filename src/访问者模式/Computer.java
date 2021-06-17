package 访问者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:03
 * @Description
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        //此处调用自身computer的visit方法
        computerPartVisitor.visit(this);
    }
}