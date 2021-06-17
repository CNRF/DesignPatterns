package 命令模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 15:46
 * @Description
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", " +
                "Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", " +
                "Quantity: " + quantity +" ] sold");
    }
}
