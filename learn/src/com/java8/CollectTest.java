package com.java8;

import java.util.List;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTest {

    public static void main(String[] args) {
        BaseStream bs ;
        String a = "a,b,c,d,e";
        String[] b = a.split(",");
        List<String> collected = Stream.of(b).collect(Collectors.toList());
        System.out.println(collected.size());
        for(int i=0;i<collected.size();i++){
            System.out.println(collected.get(i));        
        }
        
    
    }
}
