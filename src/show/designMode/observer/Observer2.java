package show.designMode.observer;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:17
 * @desc
 **/
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
