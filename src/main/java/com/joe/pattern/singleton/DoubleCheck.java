package com.joe.pattern.singleton;

/**
 * @author joe ho
 * @date 2023/6/29 13:34
 */
public class DoubleCheck {
    private static volatile DoubleCheck instance;

    private DoubleCheck() {
        System.out.println(this.getClass());
    }

    /**
     * 使用到了volatile机制。是方式(synchronized作用于方法)的升级版，俗称双重检查锁定。既保证了效率，又保证了安全。
     */
    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckKt.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}