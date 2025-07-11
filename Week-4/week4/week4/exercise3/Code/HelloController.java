package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("Start of sayHello()");
        String response = "Hello World!!";
        LOGGER.info("End of sayHello()");
        return response;
    }
    @GetMapping("/")
    public String intro() {
        LOGGER.info("Start of sayHello()");
        String response = "I am Groot!!";
        LOGGER.info("End of sayHello()");
        return response;
    }
}
