package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {

    public static void main(String[] args) {
        List<String> colleted = Stream.of("a","b","c").map(str->str.toUpperCase()).collect(Collectors.toList());
        System.out.println(colleted);
    }
}
