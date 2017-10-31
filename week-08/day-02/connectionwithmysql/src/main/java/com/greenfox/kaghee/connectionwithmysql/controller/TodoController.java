package com.greenfox.kaghee.connectionwithmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.greenfox.kaghee.connectionwithmysql.repository.TodoRepository;

@Controller
public class TodoController {
    @Autowired
    TodoRepository todoRepository;

    @RequestMapping(value="/todo")
    public String todo() {
        return "todo";
    }

    @RequestMapping(value={"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todo";
    }
}
