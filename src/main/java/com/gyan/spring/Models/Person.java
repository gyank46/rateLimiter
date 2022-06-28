package com.gyan.spring.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {


    String name;


    public Person(@JsonProperty("name") String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
