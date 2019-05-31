package show.designMode.command;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:00
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
