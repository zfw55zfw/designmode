package show.designMode.memento;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:44
 * @desc
 **/
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
