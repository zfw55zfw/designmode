package show.designMode.decorator;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:00
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();

    }
}
