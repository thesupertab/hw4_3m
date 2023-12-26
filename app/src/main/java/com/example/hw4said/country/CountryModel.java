package com.example.hw4said.country;

public class CountryModel {
    private String flag;
    private String name;

    public CountryModel(String flag, String name) {
        this.flag = flag;
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public String getName() {
        return name;
    }
}
