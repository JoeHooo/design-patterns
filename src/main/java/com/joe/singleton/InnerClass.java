package com.joe.singleton;

/**
 * @author joe ho
 * @date 2023/6/29 13:34
 */
public class InnerClass {

    private InnerClass() {
        System.out.println(this.getClass());
    }

    /**
     * 懒加载,这种方式Singleton类被装载了,instance不会被立马初始化
     */
    public static InnerClass getInstance() {
        return Inner.instance;
    }

    private static class Inner {
        private static final InnerClass instance = new InnerClass();
    }
}