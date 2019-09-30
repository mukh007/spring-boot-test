package com.example.demo.config;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Validated
@Configuration
@ConfigurationProperties(prefix = "app")
public abstract class AppProperties extends BaseAppConfig {
    @NotEmpty
    private String appName;

    @NotNull
    @NestedConfigurationProperty
    private NestedProperty nest;

    @NotNull
    @NestedConfigurationProperty
    private NestedProperty nest2;

    public String getAppName() {

        return appName;
    }

    public void setAppName(String appName) {

        this.appName = appName;
    }

    public NestedProperty getNest() {

        return nest;
    }

    public void setNest(NestedProperty nest) {

        this.nest = nest;
    }

    public NestedProperty getNest2() {

        return nest2;
    }

    public void setNest2(NestedProperty nest2) {

        this.nest2 = nest2;
    }
}
