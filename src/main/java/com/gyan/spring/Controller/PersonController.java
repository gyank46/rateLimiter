package com.gyan.spring.Controller;
import com.gyan.spring.Models.Person;
import com.gyan.spring.Service.handlePerson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gyan.spring.rateLimiter;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    handlePerson service = new handlePerson();
    int tokenCounter=0;
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity addPerson(@RequestBody Person person, HttpServletRequest request){
        if(!valid()){
            return ResponseEntity.badRequest().build();

        }
        service.addPerson(person);
        return ResponseEntity.ok().build();
    }

    private boolean valid() {
        if(rateLimiter.counter>0){
            rateLimiter.counter--;
            return true;
        }
        return false;
    }



}
