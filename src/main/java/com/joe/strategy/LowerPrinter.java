package com.joe.strategy;

/**
 * @author joe ho
 * @date 2023/6/29 15:05
 */
public class LowerPrinter implements Printer {

    @Override
    public void print(String arg) {
        System.out.println(arg.toLowerCase());
    }
}
