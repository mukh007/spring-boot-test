package com.example.demo.config;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

public class SomeObject extends BaseAppConfig {
    @NotEmpty
    private String host;
    @Range(min = 80, max = 90)
    private int port;

    public String getHost() {

        return host;
    }

    public void setHost(String host) {

        this.host = host;
    }

    public int getPort() {

        return port;
    }

    public void setPort(int port) {

        this.port = port;
    }
}
