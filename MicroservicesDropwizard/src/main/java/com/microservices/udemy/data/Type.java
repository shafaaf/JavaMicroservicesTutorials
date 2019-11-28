package com.microservices.udemy.data;

public enum Type {

    Amazon("Amazon", "AMZ"),
    UPS("Ups", "UPS");

    private String name;
    private String code;

    Type(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
