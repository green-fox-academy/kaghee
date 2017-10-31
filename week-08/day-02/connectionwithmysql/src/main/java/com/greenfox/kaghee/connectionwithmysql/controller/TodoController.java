package com.greenfox.kaghee.connectionwithmysql.controller;

import com.greenfox.kaghee.connectionwithmysql.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.greenfox.kaghee.connectionwithmysql.repository.TodoRepository;

@Controller
@RequestMapping(value="/todo")
public class TodoController {
    @Autowired
    TodoRepository todoRepository;

    Todo todo;
    boolean done;
    boolean urgent;

    @RequestMapping(value={"/", ""})
    public String list(@RequestParam(value="isActive", required=false) boolean isDone, Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todo";
    }

    @RequestMapping(value="/add")
    public String add(Model model) {
        model.addAttribute("todo", new Todo());
        model.addAttribute("isitdone", done);
        model.addAttribute("isiturgent", urgent);
        return "create";
    }

    @PostMapping(value="/add")
    public String save(@ModelAttribute Todo todo1) {
        todo1.setUrgent(urgent);
        todo1.setDone(done);
        todoRepository.save(todo1);
        return "redirect:/todo";
    }
}
