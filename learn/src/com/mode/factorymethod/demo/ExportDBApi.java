package com.mode.factorymethod.demo;

public class ExportDBApi implements ExportApi {

    @Override
    public boolean export(String data) {
        System.out.println("ExportDBAPi输出  "+data);
        return true;
    }

}
