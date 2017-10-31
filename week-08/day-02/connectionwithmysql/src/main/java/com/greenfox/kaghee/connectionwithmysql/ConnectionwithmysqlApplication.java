package com.greenfox.kaghee.connectionwithmysql;

import com.greenfox.kaghee.connectionwithmysql.model.Todo;
import com.greenfox.kaghee.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner{

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConnectionwithmysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Add this item to the list", true, false));
		todoRepository.save(new Todo("Go have lunch", false, true));
		todoRepository.save(new Todo("Write a book"));
		todoRepository.save(new Todo("Feed the fox", false, true));
		todoRepository.save(new Todo("Get sick", true, false));
		todoRepository.save(new Todo("Ask Laca to tell a joke"));
		todoRepository.save(new Todo("Record a song by System of a Down", false, true));
		todoRepository.save(new Todo("Populate this list with loooong lines"));
	}
}
