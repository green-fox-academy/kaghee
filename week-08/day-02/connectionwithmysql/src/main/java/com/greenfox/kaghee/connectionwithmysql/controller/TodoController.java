package com.greenfox.kaghee.connectionwithmysql.controller;

import com.greenfox.kaghee.connectionwithmysql.model.Assignee;
import com.greenfox.kaghee.connectionwithmysql.model.Todo;
import com.greenfox.kaghee.connectionwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.greenfox.kaghee.connectionwithmysql.repository.TodoRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/todo")
public class TodoController {
    @Autowired
    TodoRepository todoRepository;

    @Autowired
    AssigneeRepository assigneeRepository;

    @RequestMapping(value={"/", ""})
    public String list(Model model, @RequestParam(value="isActive", required=false) boolean active) {
        List<Todo> todoList = new ArrayList<>();
        for (Todo todo : todoRepository.findAll()) {
            if (active) {
                if (!todo.getDone()) {
                    todoList.add(todo);
                }
            } else {
                todoList.add(todo);         //if there's no request param, add all the todos
            }
        }
        model.addAttribute("todos", todoList);
        return "todo";
    }

    @GetMapping(value="/add")
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
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("editTodo", todoRepository.findOne(id));
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "edit";
    }

    @PostMapping(value="/{id}/edit")
    public String edit(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }
}
