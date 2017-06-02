package com.mode.facade;

public class Facade {

    public static void run(){
        AModule.say();
        BModule.say();
        CModule.say();
    }
}
