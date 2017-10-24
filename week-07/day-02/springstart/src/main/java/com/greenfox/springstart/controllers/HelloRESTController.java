package com.greenfox.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")
    public Greeting greeting() {
        Greeting g = new Greeting(1, "Helloka!");
        return g;
    }

}
