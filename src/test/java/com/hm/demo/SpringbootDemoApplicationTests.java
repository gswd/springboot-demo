package com.hm.demo;

import com.hm.demo.entity.EnvInfo;
import com.hm.demo.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private EnvInfo envInfo;

    @Test
    void contextLoads() {
    }

    @Test
    void testEnvInfo() {
        System.out.println(envInfo);
    }

}
