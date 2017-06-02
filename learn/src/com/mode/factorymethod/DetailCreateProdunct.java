package com.mode.factorymethod;

public class DetailCreateProdunct extends Creator{

    @Override
    protected Product createProduct() {
       
        return new DetailProduct();
    }

    
}
