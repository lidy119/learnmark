package com.lesson.dto;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonView;

public class BookInfo {

    @JsonView(BookListView.class)
    private  Long id ;
    @JsonView(BookListView.class)
    private String name;
    
    @JsonView(BookDetailView.class)
    @NotBlank
    private String content;
    
    @JsonView(BookDetailView.class)
    private Date publishDate;
    
    public interface BookListView{};
    
    public interface BookDetailView extends BookListView{};
    
    
    /**
     * 获取id
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     *  设置id
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取content
     * @return the content
     */
    public String getContent() {
        return content;
    }
    /**
     *  设置content
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**
     * 获取publishDate
     * @return the publishDate
     */
    public Date getPublishDate() {
        return publishDate;
    }
    /**
     *  设置publishDate
     * @param publishDate the publishDate to set
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
   
}
