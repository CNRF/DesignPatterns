package 模版方法模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 15:14
 * @Description
 */
public class Cricket  extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
