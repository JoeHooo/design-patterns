package com.joe.strategy;

/**
 * @author joe ho
 * @date 2023/6/29 15:42
 */
public class Main {
    public static void main(String[] args) {
        String arg = "Hello World";
        int condition = 2;
        print(arg, condition);
    }

    private static void print(String arg, int condition) {
        Printer printer = condition == 1
                ? new LowerPrinter()
                : new UpperPrinter();
        printer.print(arg);
    }

}
