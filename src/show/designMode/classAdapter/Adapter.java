package show.designMode.classAdapter;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:44
 * @desc
 **/
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

}
