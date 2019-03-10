package org.study.signleon.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {

        if (InterHolder.INSTANCE != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return InterHolder.INSTANCE;
    }

    private static class InterHolder {
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
