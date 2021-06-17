package 状态模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:29
 * @Description
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
