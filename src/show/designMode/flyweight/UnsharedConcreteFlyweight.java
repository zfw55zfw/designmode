package show.designMode.flyweight;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午1:59
 * @desc
 **/
public class UnsharedConcreteFlyweight extends Flyweight {
    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }
}
