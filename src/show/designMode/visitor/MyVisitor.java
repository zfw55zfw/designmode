package show.designMode.visitor;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:50
 * @desc
 **/
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }

}
