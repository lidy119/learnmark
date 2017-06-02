package com.mode.decorator;

public class FlyCarDecorator extends CarDecorator{

    public FlyCarDecorator(Car car) {
        super(car);
    }

    public void show(){
        this.getCar().show();
        this.fly();
    }
    
    public void fly(){
        System.out.println("可以飞");
    }
}