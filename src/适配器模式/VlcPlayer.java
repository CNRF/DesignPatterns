package 适配器模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:20
 * @Description
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}