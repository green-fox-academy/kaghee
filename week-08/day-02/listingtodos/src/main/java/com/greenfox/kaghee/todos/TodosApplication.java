package com.greenfox.kaghee.todos;

import com.greenfox.kaghee.todos.model.Todo;
import com.greenfox.kaghee.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepository;

	public static void main (String[] args) {
		SpringApplication.run(TodosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
