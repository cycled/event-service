package com.shangduyuan.services.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EventServiceApplication {

    @Value("${database.url}")
    String dbUrl;

    @Value("${database.username}")
    String dbUser;

    @Value("${database.password}")
    String dbPass;

    @Autowired
    void setEnvironment(Environment e) {
        System.out.println(e.getProperty("configuration.projectName"));
    }

    @RequestMapping("/")
    String hello() {
        return "DB access by " + dbUrl + ":" + dbUser + ":" + dbPass;
    }

    public static void main(String[] args) {
        SpringApplication.run(EventServiceApplication.class, args);
    }
}
