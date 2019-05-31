package show.designMode.visitor;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:50
 * @desc
 **/
public interface Subject {
     void accept(Visitor visitor);
     String getSubject();
}
