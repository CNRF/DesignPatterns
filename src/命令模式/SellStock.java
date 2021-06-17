package 命令模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 15:46
 * @Description
 */
public class SellStock implements  Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
