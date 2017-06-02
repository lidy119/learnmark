package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterTest {

    public static void main(String[] args) {
        List<String> list = Stream.of("a","1a","2b","3c").filter(val->val.endsWith("a")).collect(Collectors.toList());
        System.out.println(list);
    }
}
