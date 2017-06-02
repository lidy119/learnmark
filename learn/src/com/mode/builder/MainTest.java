package com.mode.builder;

public class MainTest {

    public static void main(String[] args) {
        //由工程队来修
        HouseBuilder GYbuilder = new GongYuBuilder();
        HouseDirector houseDirector = new HouseDirector();
        houseDirector.makeHouse(GYbuilder);
        //设计者来做
        House house = GYbuilder.getHouse();
        System.out.println(house.getFloor());
        System.out.println(house.getWall());
        System.out.println(house.getHousetop());
        
        HouseBuilder PFbuilder = new PingFangBuilder();
        houseDirector.makeHouse(PFbuilder);
        House house2 = PFbuilder.getHouse();
        System.out.println(house2.getFloor());
        System.out.println(house2.getWall());
        System.out.println(house2.getHousetop());
    }
}
