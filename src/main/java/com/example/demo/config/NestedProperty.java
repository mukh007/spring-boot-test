package com.example.demo.config;

public class NestedProperty extends BaseAppConfig {
    private String stringValue;
    private int intValue;
    private SomeObject some;

    public String getStringValue() {

        return stringValue;
    }

    public void setStringValue(String stringValue) {

        this.stringValue = stringValue;
    }

    public int getIntValue() {

        return intValue;
    }

    public void setIntValue(int intValue) {

        this.intValue = intValue;
    }

    public SomeObject getSome() {

        return some;
    }

    public void setSome(SomeObject some) {

        this.some = some;
    }
}
