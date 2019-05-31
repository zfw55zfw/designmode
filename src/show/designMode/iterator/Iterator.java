package show.designMode.iterator;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:23
 * @desc
 **/
public interface Iterator {
    //前移
     Object previous();

    //后移
     Object next();
     boolean hasNext();

    //取得第一个元素
     Object first();

}
