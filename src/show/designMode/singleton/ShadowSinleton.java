package show.designMode.singleton;

import java.util.Vector;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:17
 * @desc
 **/
public class ShadowSinleton {
    private static ShadowSinleton instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private ShadowSinleton() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new ShadowSinleton();
        }
    }

    public static ShadowSinleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties() {
        ShadowSinleton shadow = new ShadowSinleton();
        properties = shadow.getProperties();
    }

}
