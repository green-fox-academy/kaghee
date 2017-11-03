package com.greenfox.kaghee.reddit.repositories;

import com.greenfox.kaghee.reddit.models.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PostRepo extends CrudRepository <Post, Long> {
    @Query(value="SELECT * FROM post ORDER BY score DESC", nativeQuery = true)
    List<Post> findAllOrderByScoreDesc();
}
