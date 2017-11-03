package com.greenfox.kaghee.reddit.controllers;

import com.greenfox.kaghee.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/reddit")
public class PostController {
    @Autowired
    PostRepo postRepo;

    @GetMapping(value={"/", ""})
    public String list() {
        return "posts";
    }

}
