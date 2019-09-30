package com.example.demo.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.AppProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class IndexController {
    private static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
    private final ObjectMapper om = new ObjectMapper();

    @PostConstruct
    private void log() {

        LOGGER.info("Initialized with {}", appProperties);
    }

    @Autowired
    private AppProperties appProperties;

    @GetMapping("/config")
    public String getAppDetails() {

        LOGGER.info("AppProperties {}", appProperties);

        return appProperties.toString();
    }

    @GetMapping("/")
    public String getGreet() {

        return "Hola!";
    }
}
