package 模版方法模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 15:13
 * @Description
 */
public abstract  class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
