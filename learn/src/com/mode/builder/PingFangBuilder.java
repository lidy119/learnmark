package com.mode.builder;

public class PingFangBuilder implements HouseBuilder {

    House house = new House();
    
    @Override
    public void makeWall() {
        house.setWall("建设 平房  墙");        
    }

    @Override
    public void makeHouseTop() {
        house.setHousetop("建设 平房  屋顶");        
    }

    @Override
    public House getHouse() {
       
        return house;
    }

    @Override
    public void makeFloor() {
        house.setFloor("建设 平房 地板");        
    }
}
