package show.designMode.mediator;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午3:00
 * @desc
 **/
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();

}
