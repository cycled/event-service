package com.shangduyuan.services.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@SpringBootApplication
@RestController
@RefreshScope
public class EventServiceApplication {

    @Value("${database.url}")
    String dbUrl;

    @Value("${database.username}")
    String dbUser;

    @Value("${database.password}")
    String dbPass;

    @RequestMapping("/")
    String hello() {
        return "DB access by " + dbUrl + ":" + dbUser + ":" + dbPass;
    }

    public static void main(String[] args) {
        SpringApplication.run(EventServiceApplication.class, args);
    }
}
