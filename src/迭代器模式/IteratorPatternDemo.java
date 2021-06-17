package 迭代器模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 16:56
 * @Description
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
