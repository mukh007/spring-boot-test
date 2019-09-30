package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.config.AppProperties;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = {"dev"})
public class ApplicationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTests.class);

    @Autowired
    private AppProperties appProperties;

    @Test
    public void testApplicationConfiguration() {

        LOGGER.info("MJ :: {}", appProperties);
    }

}
