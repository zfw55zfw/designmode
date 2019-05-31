package show.designMode.mediator;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午3:01
 * @desc
 **/
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }

}
