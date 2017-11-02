package com.greenfox.kaghee.connectionwithmysql.controller;

import com.greenfox.kaghee.connectionwithmysql.model.Assignee;
import com.greenfox.kaghee.connectionwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/todo")
public class AssigneeController {

    @Autowired
    AssigneeRepository assigneeRepository;


    @GetMapping(value="/assignees")
    public String listAssignees(Model model) {
        List<Assignee> assignees = new ArrayList<>();


        model.addAttribute("assignees", assignees);
        return "assignees";
    }
}
