package com.joe.pattern.chain.manager;

import java.util.List;

/**
 * @author joe ho
 * @date 2023/6/29 15:16
 */
public class Manager {
    public void doHandler(List<Handler> handlers) {
        handlers.forEach(Handler::execute);
    }
}
