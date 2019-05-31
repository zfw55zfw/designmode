package show.designMode.command;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:38
 * @desc
 **/
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }

}
