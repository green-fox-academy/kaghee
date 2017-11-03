package com.greenfox.kaghee.reddit.repositories;

import com.greenfox.kaghee.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository <Post, Long> {
}
