package org.study.signleon.hungry;


public class HungryStaticSingleton {

    private static final HungryStaticSingleton instance;

    //静态代码块
    static {
        instance = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return instance;
    }
}
