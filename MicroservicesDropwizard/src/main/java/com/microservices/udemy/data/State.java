package com.microservices.udemy.data;

public enum State {
    ARIZONA("ARIZONA","AR"),
    COLORADO("Colorado","CO");

    private String name;
    private String code;

    State(String name, String code) {
        this.name = name;
        this.code = code;
    }


}
