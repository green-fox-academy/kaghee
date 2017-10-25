package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {
    BankAccount simbaAcc = new BankAccount("Simba", 2000, "lion");
    BankAccount zordonAcc = new BankAccount("Zordon", 5500, "lion");
    BankAccount timonAcc = new BankAccount("Timon", 1800, "meerkat");
    BankAccount pumbaaAcc = new BankAccount("Pumbaa", 900, "warthog");

    List<BankAccount> accs = new ArrayList<>(Arrays.asList(simbaAcc, zordonAcc, timonAcc, pumbaaAcc));

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

    @RequestMapping(value="/exercise3")
    public String htmlCeption(Model model) {
        model.addAttribute("text","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "exercise3";
    }

    @RequestMapping(value="/exercise4")
    public String showAccounts(Model model) {
        model.addAttribute("accounts", accs);
        return "exercise4";
    }

    @RequestMapping(value="/exercise5")
    public String addCounter(Model model) {
        accs.get(0).setKing();
        model.addAttribute("accounts", accs);
        return "exercise5";
    }
}
