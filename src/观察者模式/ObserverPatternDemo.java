package 观察者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 16:20
 * @Description
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("===========================");
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
