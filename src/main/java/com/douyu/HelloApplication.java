package com.douyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ApplicationObjectSupport;

@SpringBootApplication
public class HelloApplication extends ApplicationObjectSupport {
    public static void main(String[] args) {

        SpringApplication.run(HelloApplication.class, args);
    }
}
