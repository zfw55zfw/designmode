package show.designMode.iterator;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:24
 * @desc
 **/
public class MyCollection implements Collection {

    public String string[] = {"A","B","C","D","E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }

}
