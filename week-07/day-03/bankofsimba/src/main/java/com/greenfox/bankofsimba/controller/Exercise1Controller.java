package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Exercise1Controller {
    BankAccount simbaAcc = new BankAccount("Simba", 2000, "lion");


    @RequestMapping(value="/exercise1")
    public String showAcc(Model model) {
        model.addAttribute("text", simbaAcc.getName() + " " + simbaAcc.getBalance() + " " + simbaAcc.getAnimalType());
        return "exercise1";
    }
}
