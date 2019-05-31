package show.designMode.staticFactory;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:00
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        Sender mail = SenderFactory.produceMail();
        mail.send();
    }
}
