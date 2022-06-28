package com.gyan.spring;

import com.gyan.spring.Controller.PersonController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.gyan.spring.rateLimiter;

import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        int MINUTES = 1;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rateLimiter.refill();
            }
        }, 0, 1000 * 60 * MINUTES);
        SpringApplication.run(Application.class, args);
    }

}
