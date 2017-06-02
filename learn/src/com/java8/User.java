package com.java8;

import java.util.List;

public class User{
    private String name ;
    private int age;
    private List<String> books;
    
    public User(String name ,int age,List<String> books){
        this.name = name ;
        this.age = age;
        this.books = books;
    }
    
    public User(String name ,int age){
        this.name = name ;
        this.age = age;
    }
    
    
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User[name:"+this.name+" | age:"+this.age+"]";
    }



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
     * 获取books
     * @return the books
     */
    public List<String> getBooks() {
        return books;
    }



    /**
     *  设置books
     * @param books the books to set
     */
    public void setBooks(List<String> books) {
        this.books = books;
    }
}