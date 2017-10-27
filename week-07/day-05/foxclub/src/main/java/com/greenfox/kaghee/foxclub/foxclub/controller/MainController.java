package com.greenfox.kaghee.foxclub.foxclub.controller;

import com.greenfox.kaghee.foxclub.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    Fox fox;

    @RequestMapping(value="/index")
    public String index(Model model) {
        model.addAttribute("mrfox", fox.getImage());
        return "/index";
    }
}
