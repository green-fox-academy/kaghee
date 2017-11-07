package com.greenfox.kaghee.frontend.controllers;

import com.greenfox.kaghee.frontend.models.DoubledNumber;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/doubling")
    public Object doubling(@RequestParam("input") int input) {
        DoubledNumber dn = new DoubledNumber(input);
        return dn;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ErrorHndlr errorHndlr(MissingServletRequestParameterException e) {
        String name = e.getParameterName();
        return new ErrorHndlr("Please provide an " + name + "!");
    }
}
