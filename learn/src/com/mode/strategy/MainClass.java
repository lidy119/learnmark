package com.mode.strategy;

public class MainClass {
    public static void main(String[] args) {
        double num = 100d;
        Strategy s = new StrategyA();
        s = new StrategyB();
        Context c = new Context();
        c.setStrategy(s);
        System.out.println(c.cost(num));
    }
}
