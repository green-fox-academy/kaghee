package com.greenfox.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong counter = new AtomicLong(1);

    @RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam("name") String username) {
        Greeting g = new Greeting(counter.getAndIncrement(), "Helloka, " + username);
        return g;
    }

}
