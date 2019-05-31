package show.designMode.chainOfResponsibility;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:27
 * @desc
 **/
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }

}
