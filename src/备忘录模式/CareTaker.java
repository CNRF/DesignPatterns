package 备忘录模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:43
 * @Description
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
