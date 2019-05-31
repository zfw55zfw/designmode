package show.designMode.visitor;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:51
 * @desc
 **/
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }

}
