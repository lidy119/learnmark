package com.mode.prototype;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTest {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        p1.setName("zhangsan");
        p1.setAge(30);
        String f = "lisi,wangwu";
        String[] ff = f.split(",");
        List<String> friends = Stream.of(ff).collect(Collectors.toList());
        p1.setFriends(friends);
        Person p2 = (Person) p1.clone();
        System.out.println(p2);
        p2.getFriends().add("liuzi");
        System.out.println(p1);
    }
}
