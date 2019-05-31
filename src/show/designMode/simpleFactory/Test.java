package show.designMode.simpleFactory;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:00
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("sms");
        sender.send();
        Sender mail = factory.produceMail();
        mail.send();
        Sender sms = factory.produceSms();
        sms.send();
    }
}
