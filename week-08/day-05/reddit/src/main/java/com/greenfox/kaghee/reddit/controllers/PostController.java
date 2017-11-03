package com.greenfox.kaghee.reddit.controllers;

import com.greenfox.kaghee.reddit.models.Post;
import com.greenfox.kaghee.reddit.repositories.PostRepo;
import com.greenfox.kaghee.reddit.services.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/reddit")
public class PostController {
    @Autowired
    PostRepo postRepo;

    @Autowired
    VotingService votingService;

    @GetMapping(value={"/", ""})
    @Query("SELECT score, action, content FROM post ORDER BY score DESC")
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

    @GetMapping(value="/{id}/upvote")
    public String upvote(@PathVariable long id) {
        Post p = postRepo.findOne(id);
        votingService.upvote(p);
        postRepo.save(p);
        return "redirect:/reddit";
    }

    @GetMapping(value="/{id}/downvote")
    public String downvote(@PathVariable long id) {
        Post p = postRepo.findOne(id);
        votingService.downvote(p);
        postRepo.save(p);
        return "redirect:/reddit";
    }
}
