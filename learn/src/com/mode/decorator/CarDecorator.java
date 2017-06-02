package com.mode.decorator;

public class CarDecorator implements Car {

    private Car car ;
    
    public CarDecorator(Car car){
        this.car = car ;
    }
    
    @Override
    public void show() {
        
    }

    @Override
    public void run() {
        
    }

    /**
     * 获取car
     * @return the car
     */
    public Car getCar() {
        return car;
    }

    /**
     *  设置car
     * @param car the car to set
     */
    public void setCar(Car car) {
        this.car = car;
    }

}
