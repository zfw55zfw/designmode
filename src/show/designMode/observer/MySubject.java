package show.designMode.observer;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:19
 * @desc
 **/
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }


}
