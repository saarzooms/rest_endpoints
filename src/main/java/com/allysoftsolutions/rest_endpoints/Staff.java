package com.allysoftsolutions.rest_endpoints;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Staff implements Person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String display() {
        return "from staff";// this.getId() + " " + this.getName();
    }

}
