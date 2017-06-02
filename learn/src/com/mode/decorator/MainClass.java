package com.mode.decorator;

public class MainClass {

    public static void main(String[] args) {
        Car car = new RunCar();
        car.show();
        System.out.println("----------");
        
        Car swimCar = new SwimCarDecorator(car);
        swimCar.show();
        System.out.println("-----------");
        
        Car flySwimCar = new FlyCarDecorator(swimCar);
        flySwimCar.show();
    }
}
