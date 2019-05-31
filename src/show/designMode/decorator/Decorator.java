package show.designMode.decorator;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:56
 * @desc
 **/
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }

}
