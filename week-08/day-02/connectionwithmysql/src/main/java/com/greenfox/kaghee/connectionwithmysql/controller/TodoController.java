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
    boolean isitdone;
    boolean isiturgent;

    @RequestMapping(value={"/", ""})
    public String list(@RequestParam(value="isActive", required=false) boolean done, Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todo";
    }

    @RequestMapping(value="/add")
    public String add(Model model) {
        model.addAttribute("todo", new Todo());
        return "create";
    }

    @PostMapping(value="/add")
    public String save(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }

    @GetMapping(value="/{id}/delete")
    public String delete(@PathVariable long id) {
        todoRepository.delete(id);
        return "redirect:/todo";
    }

    @GetMapping(value="/{id}/edit")
    public String edit(Model model) {
        model.addAttribute("todo", new Todo());
        return "edit";
    }

    @PostMapping(value="/{id}/edit")
    public String edit(@ModelAttribute Todo todo) {
        isitdone = todo.getDone();
        isiturgent = todo.getUrgent();
        todoRepository.findOne(todo.getId()).setDone(isitdone);
        todoRepository.findOne(todo.getId()).setUrgent(isiturgent);
        return "redirect:/todo";
    }
}
