package com.greenfox.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam("name") String username) {

        Greeting g = new Greeting(1, "Helloka, " + username);
        return g;
    }

}
