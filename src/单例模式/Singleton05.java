package 单例模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 11:13
 * @Description  静态内部类
 */
public class Singleton05 {
    private static class SingletonHolder {
        private static final Singleton05 INSTANCE = new Singleton05();
    }
    private Singleton05 (){}
    public static final Singleton05 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
