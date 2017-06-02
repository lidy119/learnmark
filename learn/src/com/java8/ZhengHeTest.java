package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZhengHeTest {
    
    public static void main(String[] args) {
       List<String> book1 = Stream.of(new String[]{"yuwen","shuxue","yingyu"}).collect(Collectors.toList());
       List<String> book2 = Stream.of(new String[]{"yuwen","lishi","yingyu"}).collect(Collectors.toList());
       List<String> book3 = Stream.of(new String[]{"yuwen","dili","yingyu"}).collect(Collectors.toList());
       List<String> book4 = Stream.of(new String[]{"yuwen","lishi","yingyu"}).collect(Collectors.toList());
       List<String> book5 = Stream.of(new String[]{"yuwen","zhengzhi","yingyu"}).collect(Collectors.toList());
       
       User u1 = new User("zhangsan",18,book1);
       User u2 = new User("lisi",18,book2);
       User u3 = new User("wangwu",18,book3);
       User u4 = new User("cailiu",18,book4);
       User u5 = new User("maqi",18,book5);
       
       List<User> userList = new ArrayList<User>();
       userList.add(u1);
       userList.add(u2);
       userList.add(u3);
       userList.add(u4);
       userList.add(u5);
       
       //查找学习历史的用户的名字
       List<String> names = userList.stream().filter(u -> u.getBooks().contains("zhengzhi")).map(u -> u.getName()).collect(Collectors.toList());
       System.out.println(names);
    }
}
