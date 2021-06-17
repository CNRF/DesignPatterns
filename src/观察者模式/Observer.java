package 观察者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 16:19
 * @Description
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
