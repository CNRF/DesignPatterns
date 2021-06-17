package 观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 16:18
 * @Description
 */
public class Subject {
    private List<Observer> observers
            = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
