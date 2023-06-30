package com.joe.pattern.chain.manager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joe ho
 * @date 2023/6/29 15:29
 */
public class Main {

    public static void main(String[] args) {
        List<Handler> handlers = getHandlers();
        Manager manager = new Manager();
        manager.doHandler(handlers);
    }

    private static List<Handler> getHandlers() {
        List<Handler> handlers = new ArrayList<>(3);
        handlers.add(new EatHandler());
        handlers.add(new SleepHandler());
        handlers.add(new PlayPeasHandler());
        return handlers;
    }
}
