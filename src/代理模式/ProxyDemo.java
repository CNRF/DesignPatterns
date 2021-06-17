package 代理模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 16:38
 * @Description
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("代理模式");
        image.display();
        System.out.println("");
        image.display();
    }
}
