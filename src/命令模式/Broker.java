package 命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 15:47
 * @Description
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
