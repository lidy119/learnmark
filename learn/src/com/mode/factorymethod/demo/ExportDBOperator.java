package com.mode.factorymethod.demo;

public class ExportDBOperator extends ExportOperator {

    @Override
    protected ExportApi factoryMethod() {
        return new ExportDBApi();
    }


}
