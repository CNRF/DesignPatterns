package 代理模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 16:36
 * @Description 代理（Proxy）类
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
