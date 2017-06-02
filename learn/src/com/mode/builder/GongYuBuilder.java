package com.mode.builder;

public class GongYuBuilder implements HouseBuilder{

    House house = new House();
    
    @Override
    public void makeFloor() {

        house.setFloor("建设 公寓  地板");
    }

    @Override
    public void makeWall() {
         house.setWall("建设 公寓  墙");
    }

    @Override
    public void makeHouseTop() {
        house.setHousetop("建设 公寓 房顶");        
    }

    @Override
    public House getHouse() {
        return house;
    }

}
