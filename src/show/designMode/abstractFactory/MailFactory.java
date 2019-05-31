package show.designMode.abstractFactory;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:07
 * @desc
 **/
public class MailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
