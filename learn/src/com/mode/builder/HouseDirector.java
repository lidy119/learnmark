package com.mode.builder;

public class HouseDirector {

    public void makeHouse(HouseBuilder builder){
        builder.makeFloor();
        builder.makeHouseTop();
        builder.makeWall();
    }
}
