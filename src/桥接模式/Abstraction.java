package 桥接模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 16:51
 * @Description 抽象化角色
 */
public abstract class Abstraction {
    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }
    public abstract void Operation();
}
