package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceModeTest {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        User u1 = new User("zhangsan",28);
        User u2 = new User("lisi",19);
        User u3 = new User("wangwu",20);
        User u4 = new User("cailiu",21);
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        //所有用户年龄求和
        //通常做法
        int count = 0 ;
        for(User u : userList){
            count += u.getAge();
        }
        System.out.println(count);
        
        //reduce模式
       int count2 = Stream.of(1,2,3).reduce(0, (acc,element) -> acc+element);
       System.out.println(count2);
        
        
    }
}
