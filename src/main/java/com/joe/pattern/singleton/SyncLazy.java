package com.joe.pattern.singleton;

/**
 * @author joe ho
 * @date 2023/6/29 13:34
 */
public class SyncLazy {
    private static SyncLazy instance;

    private SyncLazy() {
        System.out.println(this.getClass());
    }

    /**
     * 在方法上加锁(通过synchronized保证线程安全),效率很低
     */
    public static synchronized SyncLazy getInstance() {
        if (instance == null) {
            instance = new SyncLazy();
        }
        return instance;
    }
}