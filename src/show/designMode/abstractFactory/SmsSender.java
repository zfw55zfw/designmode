package show.designMode.abstractFactory;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午9:59
 * @desc
 **/
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is SmsSender!");
    }
}
