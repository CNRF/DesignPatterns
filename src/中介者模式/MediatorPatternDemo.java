package 中介者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 16:50
 * @Description
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
