package com.mode.builder;

/**
 *工程队
 * @author lidongdong
 *  2017年5月26日
 */
public interface HouseBuilder {
     //修地板
    public void makeFloor();
    //修墙
    public void makeWall();
    //修屋顶
    public void makeHouseTop();
    //获取房屋
    public House getHouse();
}
