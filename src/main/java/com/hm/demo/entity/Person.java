package com.hm.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "person")
@Component
public class Person {
    private String lastName;
    private String name;
    private Integer age;
    private List<String> likes;
}
