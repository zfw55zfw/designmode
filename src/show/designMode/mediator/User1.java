package show.designMode.mediator;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午3:01
 * @desc
 **/
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }


}
