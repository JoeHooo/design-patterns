package com.joe.pattern.singleton;

/**
 * @author joe ho
 * @date 2023/6/29 14:16
 */
public enum Enum {
    INSTANCE;

    private final Singleton instance = new Singleton();

    /**
     * 懒加载,这种方式Singleton类被装载了,instance不会被立马初始化
     */
    public Singleton getInstance() {
        System.out.println(this.getClass());
        return instance;
    }

    public static class Singleton {
    }
}
