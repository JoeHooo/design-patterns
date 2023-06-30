package com.joe.pattern.singleton;

/**
 * @author joe ho
 * @date 2023/6/29 13:34
 */
public class SimpleLazy {
    private static SimpleLazy instance;

    private SimpleLazy() {
        System.out.println(this.getClass());
    }

    /**
     * 懒加载,存在线程安全问题,禁止
     */
    public static SimpleLazy getInstance() {
        if (instance == null) {
            instance = new SimpleLazy();
        }
        return instance;
    }
}