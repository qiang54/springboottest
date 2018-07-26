package com.springboot.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@SpringBootApplication
public class SpringboottestApplication {

//
//    @Value("${book.author}")
//    private String bookAuthor;
//    @Value("${book.name}")
//    private String bookName;
//
//    @Autowired
//    private AuthorSettings authorSettings;
//
//    @RequestMapping("/")
//    public String index(){
//        return " author is : "+ authorSettings.getName() + " age: " + authorSettings.getAge();
//    }


    public static void main(String[] args) {
        SpringApplication.run(SpringboottestApplication.class, args);
    }
}
