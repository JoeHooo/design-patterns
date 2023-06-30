package com.joe.pattern.chain.node;

/**
 * @author joe ho
 * @date 2023/6/29 15:23
 */
public abstract class AbstractHandler {

    private AbstractHandler next;

    public AbstractHandler getNext() {
        return next;
    }

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    protected abstract void execute();

    public void doHandler() {
        this.execute();
        while (next != null) {
            next.execute();
            next = next.getNext();
        }
    }
}
