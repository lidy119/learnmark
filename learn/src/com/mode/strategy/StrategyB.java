package com.mode.strategy;

public class StrategyB implements Strategy {

    @Override
    public double cost(double num) {
        System.out.println("策略B  5折优惠 ");
        return num * 0.5d ;
    }

}
