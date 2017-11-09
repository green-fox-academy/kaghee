package com.greenfox.kaghee.connectionwithmysql.controller;

import com.greenfox.kaghee.connectionwithmysql.model.Assignee;
import com.greenfox.kaghee.connectionwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/todo/assignee")
public class AssigneeController {

    @Autowired
    AssigneeRepository assigneeRepository;

    @GetMapping(value={"/", ""})
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assignees";
    }

    @RequestMapping(value="/add")
    public String addAssignee(Model model) {
        model.addAttribute("assignee", new Assignee());
        return "createAssignee";
    }

    @PostMapping(value="/add")
    public String saveAssignee(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/todo/assignee";
    }

    @GetMapping(value="/{id}/delete")
    public String deleteAssignee(@PathVariable long id) {
        assigneeRepository.delete(id);
        return "redirect:/todo/assignee";
    }

    @GetMapping(value="/{id}/edit")
    public String editAssignee(@PathVariable long id, Model model) {
        model.addAttribute("editAssignee", assigneeRepository.findOne(id));
        return "editAssignee";
    }

    @PostMapping(value="/{id}/edit")
    public String editAssignee(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/todo/assignee";
    }

//    @GetMapping(value = "/{id}/todolist")
//    public String assigneeTodos(@PathVariable long id, Model model) {
//        model.addAttribute("thisGuysTodos", assigneeRepository.findOne(id).getTodos());
//        return "todoslist";
//    }
}
