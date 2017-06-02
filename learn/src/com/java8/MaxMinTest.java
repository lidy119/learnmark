package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 查找一个Stream中的最大值和最小值
 * @author lidongdong
 *  2017年6月1日
 */
public class MaxMinTest {

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

        //查找年龄最小的用户
        //为了让Stream对象按照曲目长度进行排序，需要传给它一个Comparator对象。java8提供了一个新的静态方法
        //comparing,使用它可以方便地实现一个比较器。
        User user = userList.stream().min(Comparator.comparing(u -> u.getAge())).get();
        System.out.println(user.toString());

        //查找名字最长的用户
        User user2 = userList.stream().max(Comparator.comparing(u -> u.getName())).get();
        System.out.println(user2.toString());
      
    }
}

