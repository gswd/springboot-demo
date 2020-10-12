package com.hm.demo.controller;

import com.hm.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/person")
    public Person person() {
        return person;
    }

}
