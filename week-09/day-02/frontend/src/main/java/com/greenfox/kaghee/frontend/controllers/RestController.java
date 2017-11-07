package com.greenfox.kaghee.frontend.controllers;

import com.greenfox.kaghee.frontend.models.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(value = "/doubling")
    public DoubledNumber doubling(@RequestParam("input") int input) {
        return new DoubledNumber(input);
    }

    @GetMapping(value = "/greeter")
    public Greeter greet(@RequestParam("name") String name, @RequestParam("title") String title) {
        return new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
    }

    @GetMapping(value = "/appenda/{appendable}")
    public AppendedWord appenda(@PathVariable(value="appendable") String word) {
        return new AppendedWord(word);
    }

    @PostMapping(value = "/dountil/{what}")
    public Calculation dountil(@PathVariable(value="what") String operation, @RequestBody Limit limit) {
        return new Calculation(operation, limit.getUntil());
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ErrorHndlr errorHndlr(MissingServletRequestParameterException e) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        String missingPara = e.getParameterName();
        if (vowels.contains(missingPara.charAt(0))) {
            return new ErrorHndlr("Please provide an " + missingPara + "!");
        } else {
            return new ErrorHndlr("Please provide a " + missingPara + "!");
        }
    }
}
