package show.designMode.command;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:39
 * @desc
 **/
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }

}
