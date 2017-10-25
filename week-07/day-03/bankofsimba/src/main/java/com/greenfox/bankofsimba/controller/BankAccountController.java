package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankAccountController {
    BankAccount simbaAcc = new BankAccount("Simba", 2000, "lion");


    @RequestMapping(value="/exercise1")
    public String showAcc(Model model) {
        model.addAttribute("text", simbaAcc.getName() + " " + simbaAcc.getBalance() + " " + simbaAcc.getAnimalType());
        return "exercise1";
    }

    @RequestMapping(value="/exercise2")
    public String showAccInDecimals(Model model) {
        model.addAttribute("name", simbaAcc.getName());
        model.addAttribute("balance", simbaAcc.getBalance());
        model.addAttribute("currency", simbaAcc.getCurrency());
        model.addAttribute("type", simbaAcc.getAnimalType());
        return "exercise2";
    }
}
