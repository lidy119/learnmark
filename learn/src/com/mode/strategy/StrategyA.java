package com.mode.strategy;

public class StrategyA implements Strategy {

    @Override
    public double cost(double num) {
        System.out.println("策略A ： 88折 ");
        return num * 0.88;
    }

}
