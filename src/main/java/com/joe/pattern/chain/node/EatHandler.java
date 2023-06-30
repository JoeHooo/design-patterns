package com.joe.pattern.chain.node;

/**
 * @author joe ho
 * @date 2023/6/29 15:27
 */
public class EatHandler extends AbstractHandler{
    @Override
    protected void execute() {
        System.out.println("eat");
    }
}
