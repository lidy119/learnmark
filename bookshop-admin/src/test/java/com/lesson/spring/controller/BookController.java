package com.lesson.spring.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.lesson.BookShopAdminApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookShopAdminApplication.class)
public class BookController {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mocMvc;

    @Before
    public void setup() {
        mocMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void whenQuerySuccess() throws Exception {
        String result = mocMvc
                .perform(
                        get("/book").param("name", "tom adn jerry")
                                .param("categoryId", "1")
                                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(3)).andReturn()
                .getResponse().getContentAsString();
        System.out.println(result);
    }

  @Test
    public void whenGetInfoSuccess() throws UnsupportedEncodingException,
            Exception {
        String result = mocMvc
                .perform(get("/book/1").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("战争与和平")).andReturn()
                .getResponse().getContentAsString();

        System.out.println("&="+result);
    }

    @Test
    public void whenCreateSuccess() throws Exception {
        String content = "{\"id\":1,\"name\":\"战争与和平\",\"content\":null,\"publishDate\":\"2017-05-12 \"}";
        mocMvc.perform(
                post("/book/create").content(content).contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value("1"));
    }
}
