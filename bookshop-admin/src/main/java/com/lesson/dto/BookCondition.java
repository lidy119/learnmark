package com.lesson.dto;

public class BookCondition {
    private String name ;
    private Long categoryId;
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
     * 获取categoryId
     * @return the categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }
    /**
     *  设置categoryId
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    
}
