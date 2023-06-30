package com.joe.pattern.chain.node;

/**
 * @author joe ho
 * @date 2023/6/29 15:36
 */
public class Main {
    public static void main(String[] args) {
        AbstractHandler handler = getHandler();
        handler.doHandler();
    }

    private static AbstractHandler getHandler() {
        AbstractHandler rootHandler = new EatHandler();
        SleepHandler sleepHandler = new SleepHandler();
        PlayPeasHandler playPeasHandler = new PlayPeasHandler();
        rootHandler.setNext(sleepHandler);
        sleepHandler.setNext(playPeasHandler);
        return rootHandler;
    }
}
