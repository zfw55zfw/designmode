package show.designMode.iterator;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:23
 * @desc
 **/
public interface Collection {
     Iterator iterator();

    /*取得集合元素*/
     Object get(int i);

    /*取得集合大小*/
     int size();

}
