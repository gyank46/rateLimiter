package com.gyan.spring.dataAccess;

import com.gyan.spring.Models.Person;

public class DB1 implements DBInterface {


    @Override
    public void addPerson(Person person) {
        System.out.println("hello "+ person.getName());
    }
}
