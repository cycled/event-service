package com.shangduyuan.services.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EventServiceApplication {

    @Value("${database.url:localhost}")
    String dbUrl;

    @Value("${database.username:admin}")
    String dbUser;

    @Value("${database.password:admin}")
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
