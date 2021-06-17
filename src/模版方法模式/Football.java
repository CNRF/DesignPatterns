package 模版方法模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 15:15
 * @Description
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
