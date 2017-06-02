package com.mode.abstractfactory;

public interface AbstractFactory {

    /**
     * 创建抽象产品A的对象
     * @return
     * AbstractProductA
     */
    public AbstractProductA createProductA();
    
    
    /**
     * 创建抽象产品B的对象
     * @return
     * AbstractProductB
     */
    public AbstractProductB createProductB();
    
}
