package com.hm.demo.controller;

import com.hm.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private Person person;
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @ResponseBody
    @GetMapping("/person")
    public Person person() {
        return person;
    }

    @GetMapping("/t-hello")
    public String jq() {
        return "thymeleaf-hello";
    }
}
