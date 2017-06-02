package com.mode.prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {

    private String name ;
    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p = (Person)super.clone();
        List<String> ls = new ArrayList<String>();
        for(String s : friends){
            ls.add(s);
        }
        p.setFriends(ls);
        return p;
    }
    private int age;
    private List<String> friends;
    /**
     * 获取name
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     *  设置name
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取age
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     *  设置age
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * 获取friends
     * @return the friends
     */
    public List<String> getFriends() {
        return friends;
    }
    /**
     *  设置friends
     * @param friends the friends to set
     */
    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
   
    
    
}
