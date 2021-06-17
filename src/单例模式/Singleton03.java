package 单例模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 11:12
 * @Description  懒汉式，线程安全
 */
public class Singleton03 {
    private static Singleton03 instance;
    private Singleton03 (){}
    public static synchronized Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
