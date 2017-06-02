package com.mode.factorymethod;

public class TestMain {

    public static void main(String[] args) {
        DetailCreateProdunct dcp = new DetailCreateProdunct();
        dcp.createProduct().func();
    }

}
