package 访问者模式;

public interface ComputerPartVisitor {
    //多态实现
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
