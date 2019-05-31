package show.designMode.observer;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:17
 * @desc
 **/
public class Observer1 implements Observer{

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
