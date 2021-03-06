package 中介者模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 16:50
 * @Description
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
