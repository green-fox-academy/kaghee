package com.greenfox.kaghee.todos.repository;

import com.greenfox.kaghee.todos.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>{

}
