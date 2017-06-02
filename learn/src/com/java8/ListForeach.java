package com.java8;

import java.util.Arrays;

public class ListForeach {

    public static void main(String[] args) {
        int[] iArr = {1,3,4,5,6,9,10};
        Arrays.stream(iArr).forEach(System.out::println);
     
        
    }
}

class A {
    public static String a = "aaa";
    static void b(){
        System.out.println("bbbb");
    }
    
}
