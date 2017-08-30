package com.lesson.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.validation.Valid;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.lesson.dto.BookCondition;
import com.lesson.dto.BookInfo;
import com.lesson.dto.BookInfo.BookDetailView;
import com.lesson.dto.BookInfo.BookListView;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping
    @JsonView(value=BookListView.class)
    public  List<BookInfo> query(BookCondition bookCondition,@PageableDefault(size=100) Pageable pageable){
        List<BookInfo> books = new ArrayList<BookInfo>();
        books.add(new BookInfo());
        books.add(new BookInfo());
        books.add(new BookInfo());
        return books;
    }
    
    @GetMapping("/{id}")
    @JsonView(value=BookDetailView.class)
    public BookInfo getInfo(@PathVariable String id){
        throw new RuntimeErrorException(null, "test");
//        BookInfo book = new BookInfo();
//        book.setName("战争与和平");
//        book.setPublishDate(new Date());
//        return book;
    }
    
    @PostMapping("/create")
    public BookInfo create(@Valid @RequestBody BookInfo info,BindingResult br){
        if(br.hasErrors()){
            br.getAllErrors().stream().forEach(error -> System.out.print(error.getDefaultMessage()));
        }
        info.setId(1L);
        return info;
    }
    
    @PutMapping(value="/{id}")
    public BookInfo update(@Valid @RequestBody BookInfo info,BindingResult br){
        if(br.hasErrors()){
            br.getAllErrors().stream().forEach(error -> System.out.print(error.getDefaultMessage()));
        }
        info.setId(1L);
        return info;
    }
}
