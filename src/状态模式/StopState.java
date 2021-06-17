package 状态模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:29
 * @Description
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}