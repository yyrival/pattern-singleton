package org.study.signleon.seriable;

import java.io.Serializable;


public class SeriableSingleton implements Serializable {


    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 重写此方法可以避免通过序列化修改单例
     * @return
     */
    private Object readResolve() {
        return INSTANCE;
    }

}
