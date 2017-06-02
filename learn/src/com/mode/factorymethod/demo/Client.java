package com.mode.factorymethod.demo;

public class Client {

    public static void main(String[] args) {
        ExportOperator eo = new ExportFileOperator();
        eo.export("Hello ，File ！");
    }
}
