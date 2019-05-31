package show.designMode.visitor;

import show.designMode.templateMethod.AbstractCalculator;
import show.designMode.templateMethod.Plus;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:00
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
