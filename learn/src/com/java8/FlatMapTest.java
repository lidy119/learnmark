package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * flatMap方法可用Stream代替，然后将多个Stream连接成一个Stream
 * 
 * @author lidongdong
 *  2017年6月1日
 */
public class FlatMapTest {

    public static void main(String[] args) {
        List<Integer> list1 = Stream.of(new Integer[]{1,2,3}).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(new Integer[]{4,5,6}).collect(Collectors.toList());
        List<Integer> together = Stream.of(list1,list2).flatMap( numbers -> numbers.stream()).collect(Collectors.toList());
        System.out.println(together);  //[1, 2, 3, 4, 5, 6]
    }

}
