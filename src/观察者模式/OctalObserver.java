package 观察者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 16:19
 * @Description
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
