package 适配器模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:20
 * @Description
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}