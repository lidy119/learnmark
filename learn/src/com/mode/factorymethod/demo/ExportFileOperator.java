package com.mode.factorymethod.demo;

public class ExportFileOperator extends ExportOperator {

    @Override
    protected ExportApi factoryMethod() {
        return new ExportFileApi();
    }


}
