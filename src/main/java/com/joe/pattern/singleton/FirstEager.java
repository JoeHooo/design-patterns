package com.joe.pattern.singleton;

/**
 * @author joe ho
 * @date 2023/6/29 13:34
 */
public class FirstEager {
    private static final FirstEager instance = new FirstEager();

    private FirstEager() {
        System.out.println(this.getClass());
    }

    /**
     * 基于classloader机制,避免了多线程的同步问题,初始化时装载,没有懒加载
     */
    public static FirstEager getInstance() {
        return instance;
    }
}