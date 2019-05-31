package show.designMode.strategy;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:40
 * @desc
 **/
public class Plus extends AbstractCalculator implements ICalculator{

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
