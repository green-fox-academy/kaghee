package com.greenfox.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong counter = new AtomicLong(1);

    @ResponseBody
    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam("name") String username) {
        Greeting g = new Greeting(counter.getAndIncrement(), "Hello, " + username + "!");
        return g.content + " This site was loaded " + g.id + " times since last server start.";
    }
}
