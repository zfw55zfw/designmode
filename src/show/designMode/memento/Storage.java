package show.designMode.memento;

/**
 * @author zhengfawei
 * @create 2019-04-29 下午2:44
 * @desc
 **/
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }


}
