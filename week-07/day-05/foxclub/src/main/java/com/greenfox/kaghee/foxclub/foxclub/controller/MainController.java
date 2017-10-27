package com.greenfox.kaghee.foxclub.foxclub.controller;

import com.greenfox.kaghee.foxclub.foxclub.model.Fox;
import com.greenfox.kaghee.foxclub.foxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    Fox fox;

    @Autowired
    Trick trick;

    @GetMapping(value="/")
    public String index(Model model) {
        model.addAttribute("fox", fox);
        model.addAttribute("trick", trick);
        return "index";
    }

    @GetMapping(value="/learn")
    public String learn() {
        return "learn";
    }

    @PostMapping("/learn")
    public String learnTrick(@ModelAttribute Trick trick) {
        this.trick = trick;
        fox.learnTrick(trick.getDescription());
        return "redirect:/";
    }
}
