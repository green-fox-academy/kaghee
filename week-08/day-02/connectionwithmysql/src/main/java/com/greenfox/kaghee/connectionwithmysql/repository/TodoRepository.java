package com.greenfox.kaghee.connectionwithmysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.greenfox.kaghee.connectionwithmysql.model.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}

