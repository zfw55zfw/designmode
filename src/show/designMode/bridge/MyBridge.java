package show.designMode.bridge;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午11:08
 * @desc
 **/
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }

}
