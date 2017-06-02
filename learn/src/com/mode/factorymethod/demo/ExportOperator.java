package com.mode.factorymethod.demo;

public abstract class ExportOperator {

    public boolean export(String data){
        ExportApi api = factoryMethod();
        api.export(data);
        return true;
    }
    
    protected abstract ExportApi factoryMethod();
    
}
