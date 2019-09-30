package com.example.demo.config;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class BaseAppConfig {
    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);

    }
}
