package com.greenfox.kaghee.reddit.controllers;

import com.greenfox.kaghee.reddit.models.Post;
import com.greenfox.kaghee.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/reddit")
public class PostController {
    @Autowired
    PostRepo postRepo;

    @GetMapping(value={"/", ""})
    public String list(Model model) {
        model.addAttribute("postList", postRepo.findAll());
        return "posts";
    }

    @GetMapping(value="/add")
    public String addPost(Model model) {
        model.addAttribute("post", new Post());
        return "addPost";
    }

    @PostMapping(value="/add")
    public String save(@ModelAttribute Post post) {
        postRepo.save(post);
        return "redirect:/reddit";
    }
}
