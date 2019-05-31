package show.designMode.bridge;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午11:06
 * @desc
 **/
public abstract class Bridge {
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }


}
