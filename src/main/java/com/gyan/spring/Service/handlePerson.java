package com.gyan.spring.Service;

import com.gyan.spring.Models.Person;
import com.gyan.spring.dataAccess.DB1;
import com.gyan.spring.dataAccess.DBInterface;
import org.springframework.stereotype.Service;


public class handlePerson {

    DBInterface db = new DB1();
    public void addPerson(Person person){
        db.addPerson(person);
    }
}
