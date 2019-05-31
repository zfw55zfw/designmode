package show.designMode.chainOfResponsibility;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:26
 * @desc
 **/
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
