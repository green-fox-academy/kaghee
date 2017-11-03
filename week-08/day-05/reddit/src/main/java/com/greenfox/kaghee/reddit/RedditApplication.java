package com.greenfox.kaghee.reddit;

import com.greenfox.kaghee.reddit.models.Post;
import com.greenfox.kaghee.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

	@Autowired
	PostRepo postRepo;

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
