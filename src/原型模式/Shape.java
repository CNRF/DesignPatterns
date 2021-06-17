package 原型模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/4 11:44
 * @Description 必须实现Cloneable
 */
public abstract  class Shape  implements Cloneable{
    protected String type;
    private String id;
    abstract void draw();

    public Object ShapeClone(){
        Object clone=null;
        try {
            clone=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
