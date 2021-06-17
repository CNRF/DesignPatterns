package 代理模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 16:33
 * @Description   真实主题类
 */
public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("Loading" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
