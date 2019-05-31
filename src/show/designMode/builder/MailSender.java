package show.designMode.builder;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午9:59
 * @desc
 **/
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
