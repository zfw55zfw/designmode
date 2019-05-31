package show.designMode.flyweight;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午1:57
 * @desc
 **/
public class ConcreteFlyweight extends Flyweight {
    //接受外部状态
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("具体Flyweight:" + extrinsic);
    }
}
