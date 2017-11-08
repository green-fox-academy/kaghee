package com.greenfox.kaghee.guardian.controllers;

import com.greenfox.kaghee.guardian.models.ErrorResponse;
import com.greenfox.kaghee.guardian.models.Grootterance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping("/groot")
    public Object grootify(@RequestParam(value = "message", required = false) String someMessage) {
        if (someMessage == null) {
            return new ErrorResponse("I am Groot!");
        } else {
            return new Grootterance(someMessage);
        }
    }
}
