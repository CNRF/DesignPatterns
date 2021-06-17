package 备忘录模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:43
 * @Description
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}