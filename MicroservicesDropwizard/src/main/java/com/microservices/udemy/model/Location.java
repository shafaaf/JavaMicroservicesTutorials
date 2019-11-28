package com.microservices.udemy.model;

import com.microservices.udemy.data.Country;
import com.microservices.udemy.data.State;
import com.microservices.udemy.data.Type;

public class Location extends BaseEntity {

    private Country country;
    private State state;
    private Type type;
    private String code;
    private String name;

    public Location (
        Long id,
        String createdOn,
        String modifiedOn,
        Country country,
        State state,
        Type type,
        String code,
        String name
    ) {
        super(id, createdOn, modifiedOn);
        this.country = country;
        this.state = state;
        this.type = type;
        this.code = code;
        this.name = name;
    }
}
