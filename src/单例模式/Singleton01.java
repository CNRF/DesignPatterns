package 单例模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 11:10
 * @Description  饿汉式
 */
public class Singleton01 {
    private static Singleton01 instance = new Singleton01();
    private Singleton01 (){}
    public static Singleton01 getInstance() {
        return instance;
    }
}
