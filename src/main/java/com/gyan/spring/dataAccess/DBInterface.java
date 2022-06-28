package com.gyan.spring.dataAccess;
import com.gyan.spring.Models.Person;
import org.springframework.stereotype.Repository;


public interface DBInterface {

    public void addPerson(Person person);

}
