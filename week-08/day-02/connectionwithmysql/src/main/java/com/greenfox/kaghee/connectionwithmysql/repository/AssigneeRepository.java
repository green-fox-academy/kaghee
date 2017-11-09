package com.greenfox.kaghee.connectionwithmysql.repository;

import com.greenfox.kaghee.connectionwithmysql.model.Assignee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

}
