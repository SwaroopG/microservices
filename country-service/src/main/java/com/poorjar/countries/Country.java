package com.poorjar.countries;

import org.springframework.data.annotation.Id;

/**
 * Created by Swaroop on 11/3/15.
 */
public class Country {
    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
