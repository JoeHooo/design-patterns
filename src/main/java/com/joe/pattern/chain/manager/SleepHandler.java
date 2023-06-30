package com.joe.pattern.chain.manager;

/**
 * @author joe ho
 * @date 2023/6/29 15:12
 */
public class SleepHandler implements Handler {
    @Override
    public void execute() {
        System.out.println("sleep");
    }
}
