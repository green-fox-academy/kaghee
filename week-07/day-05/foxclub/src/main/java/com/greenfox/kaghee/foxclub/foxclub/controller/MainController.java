package com.greenfox.kaghee.foxclub.foxclub.controller;

import com.greenfox.kaghee.foxclub.foxclub.model.Fox;
import com.greenfox.kaghee.foxclub.foxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    Fox fox;

    @Autowired
    Trick trick;

    @RequestMapping(value="/")
    public String index(Model model) {
        model.addAttribute("fox", fox);
        model.addAttribute("zoli", fox.getNumOfTricks());

        return "index";
    }
}
