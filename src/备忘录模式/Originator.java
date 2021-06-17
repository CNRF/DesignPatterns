package 备忘录模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:43
 * @Description
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}