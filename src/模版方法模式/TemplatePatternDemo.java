package 模版方法模式;

import java.util.Optional;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 15:15
 * @Description
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        Game game2 = new Football();
          game2.play();
    }
}
