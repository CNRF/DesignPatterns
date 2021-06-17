package 解释器模式;

/**
 * @author wmx
 * @version 1.0
 * @date 2021/3/16 17:38
 * @Description
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
