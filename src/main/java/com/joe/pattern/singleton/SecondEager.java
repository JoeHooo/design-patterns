package com.joe.pattern.singleton;

/**
 * @author joe ho
 * @date 2023/6/29 13:34
 */
public class SecondEager {
    private static final SecondEager instance;

    private SecondEager() {
        System.out.println(this.getClass());
    }

    static {
        instance = new SecondEager();
    }

    /**
     * 初始化在静态块实例化instance，没有懒加载。
     */
    public static SecondEager getInstance() {
        return instance;
    }
}