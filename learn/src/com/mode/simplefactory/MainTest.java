package com.mode.simplefactory;

public class MainTest {

    public static void main(String[] args) {
        API api = ApiFactroy.createApi();
        api.say();
    }

}
