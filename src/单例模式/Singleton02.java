package 单例模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 11:11
 * @Description  懒汉式，线程不安全
 */
public class Singleton02 {
    private static Singleton02 instance;
    private Singleton02 (){}

    public static Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
}
