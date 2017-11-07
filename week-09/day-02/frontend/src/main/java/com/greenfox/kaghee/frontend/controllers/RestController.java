package com.greenfox.kaghee.frontend.controllers;

import com.greenfox.kaghee.frontend.models.DoubledNumber;
import com.greenfox.kaghee.frontend.models.Greeter;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(value = "/doubling")
    public DoubledNumber doubling(@RequestParam("input") int input) {
        DoubledNumber dn = new DoubledNumber(input);
        return dn;
    }

    @GetMapping(value = "/greeter")
    public Greeter greet(@RequestParam("name") String name, @RequestParam("title") String title) {
        Greeter g = new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
        return g;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ErrorHndlr doublingErrorHndlr(MissingServletRequestParameterException e) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        String missingPara = e.getParameterName();
        if (vowels.contains(missingPara.charAt(0))) {
            return new ErrorHndlr("Please provide an " + missingPara + "!");
        } else {
            return new ErrorHndlr("Please provide a " + missingPara + "!");
        }
    }

}
