package com.gyan.spring;

import com.gyan.spring.Controller.PersonController;

import java.util.Timer;
import java.util.TimerTask;

public class rateLimiter {

    public static rateLimiter instance= null;
    public static int counter;
    private rateLimiter(){

    }

    public static rateLimiter getInstance(){
        if(instance==null){
            System.out.println("created");
            instance=new rateLimiter();
        }
        return instance;
    }

    public static void refill() {
        counter=5;
    }

}
