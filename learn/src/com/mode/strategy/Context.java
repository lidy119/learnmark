package com.mode.strategy;

public class Context {

    private Strategy strategy ;

    public double cost(double num){
        return strategy.cost(num);
    }
    
    /**
     *  设置strategy
     * @param strategy the strategy to set
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    
}
