package show.designMode.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:27
 * @desc
 **/
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }

}
