package com.mode.factorymethod.demo;

public class ExportFileApi implements ExportApi {

    @Override
    public boolean export(String data) {
         System.out.println("ExportFileApi 输出"+data);        
         return true;
    }

}
