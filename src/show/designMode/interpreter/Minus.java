package show.designMode.interpreter;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午3:03
 * @desc
 **/
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }

}
