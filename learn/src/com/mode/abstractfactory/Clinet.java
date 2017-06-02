package com.mode.abstractfactory;

public class Clinet {

    public static void main(String[] args) {
        AbstractFactory af = new ConcreteFactory1();
        af.createProductA();
        af.createProductB();
    }

}
