package show.designMode.proxy;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:56
 * @desc
 **/
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
