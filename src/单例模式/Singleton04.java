package 单例模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 11:13
 * @Description 懒汉式（双检锁/双重校验锁（DCL）)
 */
public class Singleton04 {
    private volatile static Singleton04 singleton;
    private Singleton04 (){}
    public static Singleton04 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton04.class) {
                //在此再次检验是为了防止获取锁的过程中，被其他线程实例化
                if (singleton == null) {
                    singleton = new Singleton04();
                }
            }
        }
        return singleton;
    }
}
